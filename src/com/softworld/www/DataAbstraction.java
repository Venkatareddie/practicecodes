package com.softworld.www;


abstract class Animal
{
	public abstract void sounds();
	public void sleep()
	{
		System.out.println("Zzz");
	}
}
class Pig extends Animal
{
	public void sounds()
	{
		System.out.println("wee weee");
	}
}
public class DataAbstraction {

	
	public static void main(String[] args) {
		Pig p= new Pig();
		p.sleep();
		p.sounds();
		
		
	}

}
