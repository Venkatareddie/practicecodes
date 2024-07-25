package com.mutlithreading;

public class ThreadClassExample extends Thread{
	public void run()
	{
		for(int i=0;i<6;i++) {
			System.out.println("Child Thread");
		}
	}

	public static void main(String[] args) {
		
		ThreadClassExample tce=new ThreadClassExample();
		Thread t=new Thread(tce);
		t.start();
		for(int i=0;i<6;i++)
		{
			System.out.println("Main thread");
		}
	}

}
