package com.StaticMethodInJava;

interface Hello{
	
	static void sayHello()
	{
		System.out.println("Hello, Venkat");
	}
	
	public abstract void hi(String str) ;
}

public class StaticMethodExample2 implements Hello {

	public static void main(String[] args) {
		
		StaticMethodExample2 s=new StaticMethodExample2();
		Hello.sayHello();
		s.hi("Good Morning!!");
	}

	@Override
	public void hi(String str) {
		System.out.println(str);
		
	}

}
