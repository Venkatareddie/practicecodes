package com.softworld.www;

class Parent{
	
	public void m1()
	{
		System.out.println("m1 methiod");
	}

}
class Child extends Parent
{
	public void m2()
	{
		System.out.println("m2 method");
	}
}
class TestInheritance
{
	public static void main(String args[])
	{
		Parent p = new Parent();
		p.m1();
		System.out.println("--------------------------");
		Child c = new Child();
		c.m1();
		c.m2();
	
	}
}