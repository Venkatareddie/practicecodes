package com.methodreference;

public class MethodReference2 {
	
	public static void threadStatus()
	{
		System.out.println("Running the thread...");
	}

	public static void main(String[] args) {
		
		Thread t=new Thread(MethodReference2::threadStatus);
		t.start();
		
	}

}
