package org.example.Model;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class Save {
    public void save(HashMap<String,String> shans){
        String filePath = "shans.txt";
        try(FileWriter wr = new FileWriter(filePath,true)){
            wr.write("Призы игроков: \n");
            wr.write(shans.toString());
            wr.write("\n");
        }catch (IOException e){
            System.out.println(e.getMessage());
            System.out.println("Writing to the file failed");
        }

    }
}
