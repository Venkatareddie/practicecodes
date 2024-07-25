package com.softworld.www;

public class Encapsulation {
	//private variable for hiding the data to the outside of the class
	private int age;
	private String name;
	
	//encapsulation can be achieved by using the setters and getters methods
	
	public void setAge(int age)
	{
		this.age=age;
		
	}
	public int getAge()
	{
		return age;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName()
	{
		return name;
	}

	public static void main(String[] args) {
		Encapsulation e = new Encapsulation();
		
		e.setAge(26);
		e.setName("Venkat");
		
		System.out.println("Name of the person:"+e.getName());
		System.out.println("Age of the person:"+e.getAge());
	}

}
