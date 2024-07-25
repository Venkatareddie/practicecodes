package com.java8;
//Functional interface which contains only one Abstract method.
//It can have any number of default and static methods.It can declare the method of class object

@FunctionalInterface
interface Sayable
{
	 void say1(String msg);
}
	

public  class FunctionalInterfaceExample  implements Sayable{
	public void say1(String msg) {
		System.out.println(msg);
	
}

	public static void main(String[] args) {
		
		FunctionalInterfaceExample e=new FunctionalInterfaceExample();
		

		e.say1("Hello");
	}

	
}
