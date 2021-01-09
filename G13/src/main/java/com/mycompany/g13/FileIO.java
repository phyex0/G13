package com.mycompany.g13;

import static com.mycompany.g13.SystemClass.allOrders;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author MONSTER
 */
public class FileIO implements TimeInterface{
    String currentTime="";

    public FileIO() {
    }
   
    
    //takes current time to add to begginig of the file -Burak
    @Override
    public void setTime(){
        
          DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss MM/dd/yyyy ");
          LocalDateTime now = LocalDateTime.now();  
           currentTime = dtf.format(now)+"\n";
          
          
    
    }
    //adds date and given all of those orders to our txt file -Burak
    public void fileOutput() throws IOException{
        
        try{
            
            File f = new File("src/main/java/com/mycompany/allOrders.txt");
            if(!f.exists())
                f.createNewFile();
            
            FileWriter fw= new FileWriter(f,true);
            BufferedWriter bw = new BufferedWriter(fw); 
            setTime();
            bw.write(currentTime);
            bw.write(SystemClass.displayOrder(allOrders));
            bw.write("-----------------------------------------\n");
            bw.flush();
            bw.close();
            
            
        }catch(Exception e){
            System.out.println("fileOutputta fail");
        
        }
    
    }
    
}
