package com.mutlithreading;

//Synchronized keyword is used to ensure that only one thread can access the shared resources like object, method, class at a time i,e to prevent the concurrency issues,race condition, dead locks
class Counter{
	int count;
	public synchronized void increment()
	{
		count++;
	}
}
public class SynchronizedExample {

	public static void main(String[] args) throws InterruptedException {
		Counter c=new Counter();
		Thread t1=new Thread(()->{
		for(int i=0;i<1000;i++)
		{
			c.increment();
		}
		});
		
		Thread t2=new Thread(()->{
			for (int i=0;i<1000;i++)
			{
				c.increment();
			}
		});
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Counter:"+c.count);
		
		

	}

}
