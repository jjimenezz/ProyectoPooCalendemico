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
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
public class EventArchiver {
    
    String PATH;
    ArrayList<Evento> listadeeventos = EventManager.getListadeeventos();
    FileWriter writefile;
    PrintWriter writer;
    EventManager mainclass = new EventManager();
    
    public void writeFile(String PATH,ArrayList<Integer> ids) throws IOException{
    
       writefile = new FileWriter(PATH);
       writer = new PrintWriter(writefile);
       for(int i = 0; i < ids.size(); i++){
       
           writer.write(listadeeventos.get(ids.get(i)).toString());
       
       }
    writer.close();
    
    }
    public void readFile(String PATH) throws FileNotFoundException, ParseException{
        SimpleDateFormat format = new SimpleDateFormat("EEEE, d 'de' MMMM 'del' yyyy 'con alarma para las' hh':'mm' 'a"); 
        Scanner s = new Scanner(new File(PATH));
        
        s.useDelimiter("∏°°");
        while(s.hasNext()){
        String allevent = s.next();
        String[] varevent = allevent.split("∏");
        int id = Integer.parseInt(varevent[0]);
        String name = varevent[1];
        String tipo = varevent[2];
        String fecha = varevent[3];
        Date d = format.parse(fecha);
        if(id == 1){
        mainclass.createEvent(id, name, tipo, d, true);
        }
        else{
        mainclass.createEvent(id, name, tipo, d, false);
        }
        }
        
    }
}
