

package calendemico.Data;



import java.text.SimpleDateFormat;
import java.util.*;

public class Evento implements Comparable<Evento> {
    int id;
    String nombre;
    String tipo;
    Date d;

    public Evento(int id, String nombre, String tipo, Date d) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.d = d;
        this.id = id;
    }
    
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEventDate(Date d) {
        this.d = d;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public Date getEventDate(){      
    return d;
    }

    public void setId(int i) {
        this.id = i;
    }

    @Override
    public String toString() {
        SimpleDateFormat format = new SimpleDateFormat("EEEE, d 'de' MMMM 'del' yyyy 'con alarma para las' hh':'mm' 'a"); 
        return "∏°°" +  id + "∏" + nombre + "∏" + tipo + "∏" +format.format(d);
    }

    @Override
    public int compareTo(Evento t) {
        return d.compareTo(t.getEventDate());
    }

    
    
    
    
}
