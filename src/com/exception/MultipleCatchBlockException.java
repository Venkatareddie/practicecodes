package com.exception;

public class MultipleCatchBlockException {

	public static void main(String[] args) {
		try {
			int arr[]=new int[4];
			arr[5]=10;
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException Error:"+ e);
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayOutofBoundsException :"+ e);
		}
		catch(Exception e)
		{
			System.out.println("ParentException:"+ e);
		}
	}

}
