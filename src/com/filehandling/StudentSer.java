package com.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class StudentData implements Serializable{
	int sid;
	String sname;
	int sage;
	
	public StudentData(int sid,String sname, int sage)
	{
		this.sid=sid;
		this.sname=sname;
		this.sage=sage;
	}
	  @Override
	    public String toString() {
	        return "Sid="+sid +",Sname="+sname+",Sage="+sage;
	    }
}
public class StudentSer {

	public static void main(String[] args) {
		
		StudentData data= new StudentData(1,"venkat",26);
		
		
		
			 FileOutputStream fos=null;
			 ObjectOutputStream oos=null;
			 String filename="C:\\Users\\venka\\OneDrive\\Documents\\s.ser";
			 try {
				 fos= new FileOutputStream(filename);
				 oos=new ObjectOutputStream(fos);
				 
				 oos.writeObject(data);
				 
				 System.out.println("Object is serialized....");
				 
				 fos.close();
				 oos.close();
				
		}
			 catch(IOException i)
			 {
				 i.printStackTrace();
			 }
			 
		FileInputStream fis =null;
		ObjectInputStream ois=null;
		
		try
		{
			fis = new FileInputStream(filename);
			ois=new ObjectInputStream(fis);
			
			StudentData result= (StudentData)ois.readObject();
			
			System.out.println("Object is deserialized...\n"+result);
			
			fis.close();
			ois.close();
		}
		catch(IOException ex)
		{
			System.out.println("Io exception is cought....");
		}
		catch(ClassNotFoundException ex)
		{
			System.out.println("Class not found exception cought");
		}
		
	}

}
