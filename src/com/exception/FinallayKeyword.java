package com.exception;

public class FinallayKeyword {

	public static void main(String[] args) {
		try {
			int k =5/0;
			System.out.println(k);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception Happen");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Executed Irrespetive..");
		}
		System.out.println("Continue the code");
	}

}
