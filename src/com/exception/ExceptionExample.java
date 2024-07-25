package com.exception;

public class ExceptionExample {

	public static void main(String[] args) {
		try {
			int a=23/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.print("Rest of your code");
		}
	}

}
