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
        Evento temporal = e.get(0);
        for(int i=0; i<e.size(); i++){
            for(int j=0; j<e.size()-1;j++){
                if(e.get(j).getEventDate().after(e.get(j+1).getEventDate())){
                    temporal = e.get(j);
                    e.set(j, e.get(j+1));
                    e.set(j+1, temporal);
                }
            }
        }
    }

    public static ArrayList<Evento> getListaDeEventosOrdenados() {
        return e;
    }
    
}
