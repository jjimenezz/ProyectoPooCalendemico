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
    if(name == null||tipo == null||d == null){
        return false;
    }   
    else{
        Date daterevised = this.hasAlarm(d, hr, min);
        Evento e = new Evento(name,tipo,daterevised);
        listadeeventos.add(e);
        notificateEvent(e);
        return true;
    }
    
    }

    public Date hasAlarm(Date d, int hr, int min){
    
    if(hr == 0 && min == 0){
    return d;
    }
    else{
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
    
    }
    
    public void notificateEvent(Evento e){
        
    txt = "Has Agregado un Evento!!!\nNombre del Evento: " + e.getNombre() + "\n";
    txt = txt + "Tipo de Evento: " + e.getTipo() + "\n";
    
    SimpleDateFormat format = new SimpleDateFormat("EEEE, d 'de' MMMM 'del' yyyy");
    txt = txt + "Fecha: " + format.format(e.getEventDate());
    }
    
    public String showEvents(){
    String Eventos = "";
       int i = 1;
       
       SimpleDateFormat format = new SimpleDateFormat("EEEE, d 'de' MMMM 'del' yyyy");
       for(Evento e : listadeeventos){
           
       Eventos = Eventos + "\n" + i + ". Evento: " + e.getNombre();
       
       Eventos = Eventos + "\nFecha: " + format.format(e.getEventDate());
       
       i++;
       }
       return Eventos;
    }
    
    public String getDateText(){
    return txt;
    }
}

