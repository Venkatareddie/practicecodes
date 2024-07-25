package com.functionalinterfaces;

public class RannableInterfaceExample {

	public static void main(String[] args) {
		
		Runnable r = new Runnable() {
			public void run()
			{
				System.out.println("Thread is running....");
			}
		};
		Thread t=new Thread(r);
		t.start();
	}

}
