/*
Crea un objeto de Tipo Evento y almacena los eventos creados.
 */
package calendemico.LogicBusiness;

import calendemico.Data.Evento;
import calendemico.UI.MainFrame;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
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
    public boolean createEvent(String name, String tipo, Date d, int hr, int min){
    if(name == null||tipo == null||d == null||hr >= 24 || min >= 60){
        return false;
    }   
    else{
        Date daterevised = this.setAlarm(d, hr, min);
        Evento e = new Evento(listadeeventos.size()+1,name,tipo,daterevised);
        listadeeventos.add(e);
        return true;
    }
    
    }
    public boolean editEvent(int id ,String name, String tipo, Date d, int hr, int min){
    if(name == null||tipo == null||d == null||hr >= 24 || min >= 60){
        return false;
    }   
    else{
        Date daterevised = this.setAlarm(d, hr, min);
        
        listadeeventos.get(id-1).setNombre(name);
        listadeeventos.get(id-1).setTipo(tipo);
        listadeeventos.get(id-1).setEventDate(daterevised);
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
        
    }
    public Date setAlarm(Date d, int hr, int min){
    
    GregorianCalendar g = new GregorianCalendar();
    g.setTime(d);
    String alarma;
    g.set(Calendar.HOUR, hr);
    g.set(Calendar.MINUTE, min);
    Date nuevo = g.getTime();
    return nuevo;
    
    
    }
    
    
    
    public Object[][] showEvents(){
    Object[][] listaeventos = new String[(listadeeventos.size())][5];
       
       int i = 0;
       int id = 1;
       SimpleDateFormat format = new SimpleDateFormat("EEEE, d 'de' MMMM 'del' yyyy");
       SimpleDateFormat format2 = new SimpleDateFormat("hh':'mm' 'a");
       for(Evento e : listadeeventos){
        
       listaeventos[i][0] = String.valueOf(id);    
       listaeventos[i][1] = e.getNombre();
       listaeventos[i][2] = e.getTipo();
       listaeventos[i][3] = format.format(e.getEventDate());
       listaeventos[i][4] = format2.format(e.getEventDate());
       
       
       i++;
       id++;
       }
       
       return listaeventos;
    }
    
}

