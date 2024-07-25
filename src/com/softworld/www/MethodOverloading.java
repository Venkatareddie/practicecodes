package com.softworld.www;

public class MethodOverloading {
	
	public void m1(int a, int b)
	{
		System.out.println(a+" "+b);
	}
	public void m1(int a, int b, int c)
	{
		System.out.println(a+ " " +b+ "  "+ c);
	}

	public static void main(String[] args) {
		MethodOverloading  m = new MethodOverloading ();
		m.m1(2, 9);
		m.m1(4, 8, 5);
		

	}

}
