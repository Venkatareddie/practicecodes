package com.softworld.www;

public class ThisAndSuperKeyword {
	
private int student_id;
private String student_name;
public ThisAndSuperKeyword(int student_id, String student_name)
{
	this.student_id=student_id;
	this.student_name=student_name;
	
	System.out.println(student_id+ " "+student_name);
}
	public static void main(String[] args) 
	{
		ThisAndSuperKeyword t=new ThisAndSuperKeyword(3,"venkat");
		
		
		
	}

}
