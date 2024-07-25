package com.functionalinterfaces;

import java.util.function.Consumer;

public class ConsumerInterfaces {

	//It is functional interface defined in import java.util.function package.
	//It contain abstract accept() and a default and Then method present.
	//It is used as assignment target for lambda expression or method reference.
	
	static void printMessage(String name)
	{
		System.out.println("Hello, "+name);
	}
	static void printvalue(int val)
	{
		System.out.println(val);
	}
	public static void main(String[] args) {
		
		Consumer<String> c1=ConsumerInterfaces::printMessage;
		c1.accept("Venkat");
		
		Consumer<Integer> c2=ConsumerInterfaces::printvalue;
		c2.accept(19);
		
		

	}

}
