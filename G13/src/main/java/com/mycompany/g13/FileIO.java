/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class FileIO {
    //takes current time to add to begginig of the file
    public static String setTime(){
        
          DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss MM/dd/yyyy ");
          LocalDateTime now = LocalDateTime.now();  
          String currentTime = dtf.format(now);
          
          return currentTime+"\n";
    
    }
    //adds date and given all of those orders to our txt file
    public static void fileOutput() throws IOException{
        
        try{
            File f = new File("src/main/java/com/mycompany/allOrders.txt");
            if(!f.exists())
                f.createNewFile();
            
            FileWriter fw= new FileWriter(f,true);
            BufferedWriter bw = new BufferedWriter(fw); 
            
            bw.write(setTime());
            bw.write(SystemClass.displayOrder(allOrders));
            bw.write("-----------------------------------------\n");
            bw.flush();
            bw.close();
            
            
        }catch(Exception e){
        
        }
    
    }
    
}
