package com.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable
{
	String pname;
	int page;
	double pheight;
	
	public Person(String name,int age, double d)
	{
		this.pname=name;
		this.page=age;
		this.pheight=d;
	}
	public String toString()
	{
		return pname+ " "+page+" "+pheight;
	}
}

public class HumanSer {

	public static void main(String[] args) {
		Person p=new Person("venkat",26,6.2);
		
			String filename = "C:\\Users\\venka\\OneDrive\\Documents\\venkatdetails.ser";
			FileOutputStream fos=null;
			ObjectOutputStream oos=null;
			
			try {
				fos = new FileOutputStream(filename);
				oos= new ObjectOutputStream(fos);
				
				oos.writeObject(p);
				
				System.out.println("Here Object is serialized....");
				
				fos.close();
				oos.close();
						
		} catch(IOException i)
			{
			i.printStackTrace();
			}
			
			FileInputStream fis=null;
			ObjectInputStream ois=null;
			
			try {
				fis = new FileInputStream(filename);
				ois = new ObjectInputStream(fis);
				
				Person result = (Person) ois.readObject();
				
				System.out.println("Here object is deserialized...\n"+ result);
				
				fis.close();
				ois.close();
			}
			catch(IOException ex)
			{
				System.out.println("Io exception cought..");
			}
			catch(ClassNotFoundException ex)
			{
				System.out.println("Class not found exception cought....");
			}
			

	}

}
