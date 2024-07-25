package com.filehandling;

import java.io.FileOutputStream;
import java.io.*;

public class BinaryFileWriting {

	public static void main(String[] args) {
		
		byte []data= {1,2,3,5,6,7,8};
		
		try {
			FileOutputStream o=new FileOutputStream("C:\\Users\\venka\\OneDrive\\Documents\\venkat.bin");
			o.write(data);
			System.out.println("Data written successfully");
			
            } 
			catch(IOException i) {
				i.printStackTrace();
				
	
	
		}
	}
}
