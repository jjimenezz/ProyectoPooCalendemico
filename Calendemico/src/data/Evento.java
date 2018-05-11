

package data;


import java.text.SimpleDateFormat;
import java.util.*;

/** Defini 3 atributos a la clase Evento que son 
 * Nombre 
 * Tipo, representado por un entero el cual se le asigna un valor segun convenga, ejm Parcial es 2.
 * Date, que lo utilizamos para asignarle una fecha a este.
 
 **/
public class Evento {
    String nombre;
    int tipo;
    Date d;

    public Evento(String nombre, int tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

/** Este metodo es unicamente un instructivo para ver las funcionalidades de las clases
 * Date, GregorianCalendar, Calendar y SimpleDateFormat, implementaremos este metodo con la UI
 * que haremos, utilizaremos JCalendar que su funcionalidad es mucho mas práctica por lo que les sugiero
 * ver este componente de Swing.
   **/ 
    public void setEventDate(){
    
        System.out.println("Indica la fecha para programar el evento:");
        Scanner s = new Scanner(System.in);
        System.out.println("Año:");
        int year = s.nextInt();
        System.out.println("Mes:");
        int month = s.nextInt();
        System.out.println("Dia:");
        int day = s.nextInt();
        d = new GregorianCalendar(year,month-1,day).getTime();
        System.out.println("Desea agregarle hora y minuto? S para Si N para No");
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy"); 
        String datetoformat = format.format(d);
        char ans = s.next().charAt(0);
        if(ans == 'S'){
            System.out.println("Hora en formato 24 hr:");
            int hr = s.nextInt();
            System.out.println("Minuto:");
            int min = s.nextInt();
            d = new GregorianCalendar(year,month-1,day,hr,min).getTime();
            SimpleDateFormat format2 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
            String datetoformat2 = format2.format(d);
            System.out.println(datetoformat2);
        }
        else{
            System.out.println(datetoformat);
        }
        
        
        
    }
    public Date getEventDate(){
    return d;
    }

    
    
    
    
}
