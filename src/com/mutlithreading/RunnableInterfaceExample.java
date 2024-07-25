package com.mutlithreading;

//class implements the runnable interface
//class extends thread, it extends the runnable interface is the 2nd way
public class RunnableInterfaceExample implements Runnable {
	public void run()
	{
		//child thread. which run method used in the runnable interface.
		for(int i=0;i<5;i++)
		{
			System.out.println("Child Thread");
		}
	}

	public static void main(String[] args) {
		
		
		RunnableInterfaceExample rix= new RunnableInterfaceExample();
		
		Thread t=new Thread(rix);
		
		t.start();
		
		//main thread
		for(int i=0;i<5;i++)
		{
			System.out.println("Main Thread");
		}

	}

}
