/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendemico.LogicBusiness;

/**
 *
 * @author danie
 */
import calendemico.Data.Evento;
import calendemico.LogicBusiness.EventManager;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
public class EventArchiver {
    
    String PATH;
    ArrayList<Evento> listadeeventos = EventManager.getListadeeventos();
    FileWriter writefile;
    PrintWriter writer;
    
    public void writeFile(String PATH,ArrayList<Integer> ids) throws IOException{
    
       writefile = new FileWriter(PATH);
       writer = new PrintWriter(writefile);
       for(int i = 0; i < ids.size(); i++){
       
           writer.write(listadeeventos.get(ids.get(i)).toString() + "\n");
       
       }
    writer.close();
    
    }
}
