package com.softworld.www;

class Animals
{
	public void eat()
	{
		System.out.println("Eat biscut");
	}
}
class Cat extends Animals
{
	public void speek()
	{
		super.eat();
		System.out.println("meow meow....");
	}
	
}
public class SuperKeyword {

	public static void main(String[] args) {
		Cat c= new Cat();
		c.speek();
				
				

	}

}
