package com.methodreference;

//Referring to the static method reference.
//Method reference is used to refer method of functional interface. 
//static method defined in the class

interface HelloMessage
{
	void message();
}

public class StaticMethodReference {
	
	public static void helloMessage()
	{
		System.out.println("Hello, Venkat");
	}
	

	public static void main(String[] args) {
		
		HelloMessage h = StaticMethodReference ::helloMessage;
		h.message();

	}

}
