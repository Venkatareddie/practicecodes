package com.softworld.www;

class A
{
	public void a()
	{
		System.out.println("A method");
	}
}
class B extends A
{
	public void b()
	{
		System.out.println("B method");
	}
}
class C extends B
{
	public void c()
	{
		System.out.println("C method");
	}
}

public class MutliLevelInheritance {

	public static void main(String[] args) {
		B b =new B();
		b.a();
		b.b();
		
		System.out.println("---------------------");
		
		C c = new C();
		c.a();
		c.b();
		c.c();
		

	}

}
