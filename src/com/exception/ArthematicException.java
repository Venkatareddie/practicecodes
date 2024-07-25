package com.exception;

public class ArthematicException {

	public static void main(String[] args) {
		try {
			int a=14/0;
			System.out.println("Continution...");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Rest of the code...");

	}

}
