package com.exception;

public class ArrayOutBoundException {

	public static void main(String[] args) {
		try {
			int arr[]= {2,3,4,5};
			System.out.println(arr[6]);	
		}
		catch(Exception e)
		{
			System.out.println(e);
	System.out.println("Rest of the code");
		}
		
	}

}
