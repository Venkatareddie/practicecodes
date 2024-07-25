package com.softworld.www;

class D
{
	public void a()
	{
		System.out.println("A method");
	}
}
class E extends D
{
	public void b()
	{
		System.out.println("B method");
	}
}
class F extends D
{
	public void c()
	{
		System.out.println("C method");
	}
}

public class HybridInheritance {

	public static void main(String[] args) {
		
		F b =new F();
		b.a();
		b.c();
	
		System.out.println("--------------------------");
		
		E c = new E();
		c.a();
		c.b();;
		

	}

}
