/*
Crea un objeto de Tipo Evento y almacena los eventos creados.
 */
package calendemico.LogicBusiness;

import calendemico.Data.Evento;
import calendemico.UI.MainFrame;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author danie
 */
public class EventManager {
    
    static ArrayList<Evento> listadeeventos = new ArrayList<>();
    

    /**
     * @param args the command line arguments
     * @throws javax.swing.UnsupportedLookAndFeelException
     */
    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        
        calendemico.UI.MainFrame.main(args);
    }

    public static ArrayList<Evento> getListadeeventos() {
       return listadeeventos;
    }

    public boolean createEvent(String name, String tipo, Date d, int hr, int min) throws UnsupportedLookAndFeelException{
    if(name == null||tipo == null||d == null||hr >= 24 || min >= 60){
        return false;
    }   
    else{
        Date daterevised = this.setAlarm(d, hr, min);
        Evento e = new Evento(listadeeventos.size()+1,name,tipo,daterevised);
        organizateEvent(e);
        return true;
    }
    
    }
    public void createEvent(int id, String name, String tipo, Date d, boolean isFirstEvent){
        if(isFirstEvent){
        listadeeventos.clear();
        Evento e = new Evento(id,name,tipo,d);
        organizateEvent(e);
        }
        else{
        Evento e = new Evento(id,name,tipo,d);
        organizateEvent(e);
        }
    
    }
    public boolean editEvent(int id ,String name, String tipo, Date d, int hr, int min) throws UnsupportedLookAndFeelException{
    if(name == null||tipo == null||d == null||hr >= 24 || min >= 60){
        return false;
    }   
    else{
        Date daterevised = this.setAlarm(d, hr-12, min);
        
        listadeeventos.get(id-1).setNombre(name);
        listadeeventos.get(id-1).setTipo(tipo);
        listadeeventos.get(id-1).setEventDate(daterevised);
        organizateArrayList();
        return true;
    }
    }

    public void deleteEvent(int id){
        
        listadeeventos.remove(id-1);
        for(Evento e : listadeeventos){
       if(e.getId() > id){
       e.setId(e.getId()-1);
       }
       }
        organizateArrayList();
    }
    public Date setAlarm(Date d, int hr, int min) throws UnsupportedLookAndFeelException{

    GregorianCalendar g = new GregorianCalendar();
    g.setTime(d);
    g.set(Calendar.HOUR, hr-12);
    g.set(Calendar.MINUTE, min);
    Date nuevo = g.getTime();
    return nuevo;
    
    
    }
    public void organizateEvent(Evento ev){
    listadeeventos.add(ev);
    Collections.sort(listadeeventos);
    int i = 1;
    for (Evento e:listadeeventos){
    e.setId(i);
    i++;
    }
    }
    
    public void organizateArrayList(){
    Collections.sort(listadeeventos);
    int i = 1;
    for (Evento e:listadeeventos){
    e.setId(i);
    i++;
    }
    
    }
    public Object[][] showEvents(){
    Object[][] listaeventos = new String[(listadeeventos.size())][5];
       
       int i = 0;
       SimpleDateFormat format = new SimpleDateFormat("EEEE, d 'de' MMMM 'del' yyyy");
       SimpleDateFormat format2 = new SimpleDateFormat("hh':'mm' 'a");
       for(Evento e : listadeeventos){
        
       listaeventos[i][0] = String.valueOf(e.getId());    
       listaeventos[i][1] = e.getNombre();
       listaeventos[i][2] = e.getTipo();
       listaeventos[i][3] = format.format(e.getEventDate());
       listaeventos[i][4] = format2.format(e.getEventDate());
       
       
       i++;
       }
       
       return listaeventos;
    }
    
}

