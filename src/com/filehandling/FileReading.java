package com.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReading {

	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("C:\\Users\\venka\\OneDrive\\Documents\\venkat.txt");
		try {
		
			Scanner sc = new Scanner(f) ;
			while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
               
            }
			sc.close();
            
        } 
		catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}