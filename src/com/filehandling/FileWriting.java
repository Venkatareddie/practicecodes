package com.filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {

    public static void main(String[] args) {
       
        
        try {  
        	
        File f = new File("C:\\Users\\venka\\OneDrive\\Documents\\myfile.txt");
        String content = "Hello, Venkat. How are you, Good or Bad?";
        FileWriter fw = new FileWriter(f) ;
        fw.write(content);
        fw.close();
        
        }      
        catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
