package com.filehandling;

import java.io.FileInputStream;
import java.io.IOException;

public class BinaryFileReading {

	public static void main(String[] args) {
		try {
			FileInputStream i= new FileInputStream("C:\\Users\\venka\\OneDrive\\Documents\\venkat.bin");
			int  content;
			while((content=i.read())!=-1)
			{
				System.out.println(content);
			}
			
		}
		catch(IOException i)
		{
			i.printStackTrace();
		}
		
	}

}
