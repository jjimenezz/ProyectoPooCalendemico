/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diseño1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author danie
 */
public class Diseño1 {

    static String txt = "";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        diseño11 d = new diseño11();
        d.setVisible(true);
    }
    public void setDateText(Date d){
    GregorianCalendar g = new GregorianCalendar();
    g.setTime(d);
    txt = "Has Agregado un Evento!!!\nEl dia: " + g.get(Calendar.DAY_OF_MONTH) + "\nDel mes: " + (g.get(Calendar.MONTH)+1) +"\nDel Año: "
            + g.get(Calendar.YEAR);
        System.out.println(txt);
    }
    
    public String getDateText(){
    return txt;
    }
}

