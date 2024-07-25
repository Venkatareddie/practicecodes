package com.collectionframework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class ArrayListSerializationandDeserialisation {

	public static void main(String[] args) {
		
		ArrayList<String>al=new ArrayList<String>();
		al.add("venkat");
		al.add("vishnu");
		al.add("Srinu");
		
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		String file="array.ser";
		try {
			fos= new FileOutputStream(file);
			oos=new ObjectOutputStream(fos);
			
			oos.writeObject(al);
			
			System.out.println("Objects Serialized....");
			
			fos.close();
			oos.close();
			
			
		}catch(IOException ex)
		{
			ex.printStackTrace();
		}
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		
		try {
			fis=new FileInputStream(file);
			ois=new ObjectInputStream(fis);
			
			ArrayList l=(ArrayList) ois.readObject();
			System.out.println(l);
			
			System.out.println("Deserialized...");
				
	}catch(IOException ex)
		{
		System.out.println("Io Eception cought");
		}
		catch(ClassNotFoundException ex)
		{
			System.out.println("class not found exception cought..");
		}
		

	}

}
