package com.StaticMethodInJava;

public class StaticMethodExample {
	
	public static int add(int a,int b)
	{
		return a+b;
	}
	public static int sub(int a, int b)
	{
		return a-b;
	}
	public static int multi(int a, int b)
	{
	return a*b;
	}
	public static int div(int a, int b)
	{
		return a/b;
	}

	public static void main(String[] args) {
		int addition= StaticMethodExample.add(2, 8);
		int substration=StaticMethodExample.sub(9, 6);
		int multiplication=StaticMethodExample.multi(8, 3);
		int division=StaticMethodExample.div(3, 2);
		System.out.println("Addition: "+addition);
		System.out.println("Substraction: "+substration);
		System.out.println("Multiplication: "+multiplication);
		System.out.println("Division: "+division);
		
		
		
	}

}
