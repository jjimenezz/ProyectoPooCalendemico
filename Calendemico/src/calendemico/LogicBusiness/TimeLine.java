package calendemico.LogicBusiness;
import calendemico.Data.Evento;
import calendemico.LogicBusiness.EventManager;
import java.util.*;
/**
 *
 * @author Magnert
 */
public class TimeLine {
    EventManager event = new EventManager();
    static ArrayList<Evento> e = new ArrayList(){};
    public TimeLine(){};
    public void createTimeLine(){
        e = EventManager.getListadeeventos();
        Date temporal;
        for(int i=0; i<e.size(); i++){
            for(int j=1; j<e.size()-i; j++){
                if(e.get(j-1).getEventDate().after(e.get(j).getEventDate())){
                    temporal = e.get(j-1).getEventDate();
                    e.set(j-1, e.get(j));
                    e.set(j, e.get(j-1));
                }
            }
        }
    }

    public static ArrayList<Evento> getListaDeEventosOrdenados() {
        return e;
    }
    
}
