/*
Crea un objeto de Tipo Evento y almacena los eventos creados.
 */
package calendemico.LogicBusiness;

import calendemico.Data.Evento;
import calendemico.UI.MainFrame;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author danie
 */
public class EventManager {
    
    static ArrayList<Evento> listadeeventos = new ArrayList<>();

    static String txt = "";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MainFrame d = new MainFrame();
        d.setVisible(true);
    }

    public static ArrayList<Evento> getListadeeventos() {
       return listadeeventos;
    }
    public void createEvent(String name, String tipo, Date d){
        
    Evento e = new Evento(name,tipo,d);
    listadeeventos.add(e);
    txt = "Has Agregado un Evento!!!\nNombre del Evento: " + name + "\n";
    txt = txt + "Tipo de Evento: " + tipo + "\n";
    GregorianCalendar g = new GregorianCalendar();
    g.setTime(d);
    txt = txt + "El dia: " + g.get(Calendar.DAY_OF_MONTH) + "\nDel mes: " + (g.get(Calendar.MONTH)+1) +"\nDel Año: "
            + g.get(Calendar.YEAR);
        System.out.println(txt);
    
        
    
    
    
    }

    
    
    
    
    public String getDateText(){
    return txt;
    }
}

