package com.softworld.www;

public class ScopeOfJava {

private int puppyAge;
public static String breed="BullDog";
	
	
	public int getPuppyAge()
	{
		return puppyAge;
	}
	public void setPuppyAge(int puppyAge)
	{
		this.puppyAge=puppyAge;
	}

	public static void main(String[] args) {
		
		// local variables
	      int a = 10;
	      int b = 20;
	      
	      int c = a + b;
	      
		PuppyInstance p=new PuppyInstance();
		p.setPuppyAge(3);
		System.out.println(p.getPuppyAge());
		System.out.println(ScopeOfJava.breed);
		
		System.out.println( c);

	}




	}


