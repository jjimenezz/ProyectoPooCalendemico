

package calendemico.Data;



import java.util.*;

public class Evento {
    String nombre;
    String tipo;
    Date d;

    public Evento(String nombre, String tipo, Date d) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.d = d;
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

    
    
    
    
}
