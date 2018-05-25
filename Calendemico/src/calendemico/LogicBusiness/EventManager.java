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

    static String txt = "";
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
        Evento e = new Evento(name,tipo,daterevised);
        listadeeventos.add(e);
        notificateEvent(e);
        return true;
    }
    
    }

    public Date setAlarm(Date d, int hr, int min){
    
    GregorianCalendar g = new GregorianCalendar();
    g.setTime(d);
    String alarma;
    g.set(Calendar.HOUR, hr);
    g.set(Calendar.MINUTE, min);
    Date nuevo = g.getTime();
    alarma = "Alarma a las: " + hr + ":" + min;
    System.out.println(alarma);
    return nuevo;
    
    
    }
    
    public void notificateEvent(Evento e){
        
    txt = "Has Agregado un nuevo Evento: " + e.getNombre() + "\n";
    SimpleDateFormat format = new SimpleDateFormat("EEEE, d 'de' MMMM 'del' yyyy");
    txt = txt + "Para el " + format.format(e.getEventDate());
    }
    
    public String[][] showEvents(){
    String[][] listaeventos = new String[(listadeeventos.size())][4];
       
       int i = 0;
       
       SimpleDateFormat format = new SimpleDateFormat("EEEE, d 'de' MMMM 'del' yyyy");
       SimpleDateFormat format2 = new SimpleDateFormat("hh':'mm' 'a");
       for(Evento e : listadeeventos){
           
       listaeventos[i][0] = e.getNombre();
       listaeventos[i][1] = e.getTipo();
       listaeventos[i][2] = format.format(e.getEventDate());
       listaeventos[i][3] = format2.format(e.getEventDate());
       
       
       i++;
       }
       
       return listaeventos;
    }
    
    public String getDateText(){
    return txt;
    }
}

