

package data;


import java.util.*;

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
        System.out.println("Desea agregarle hora y minuto? S para si N para no");
        char ans = s.next().charAt(0);
        if(ans == 'S'){
        System.out.println("Hora:");
        int hr = s.nextInt();
        System.out.println("Minuto:");
        int min = s.nextInt();
        d = new GregorianCalendar(year,month-1,day,hr,min).getTime();
        System.out.println(d);
        }
        else{
        System.out.println(d);
        }
        
        
        
    }
    public Date getEventDate(){
    return d;
    }

    
    
    
    
}
