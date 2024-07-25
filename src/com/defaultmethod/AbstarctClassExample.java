package com.defaultmethod;

abstract class Abstractclass
{
	Abstractclass()
	{
		System.out.println("This counstructor method");
	}
	abstract int add(int a, int b); 
	static int mutliply(int a, int b) {
		return a*b;
	}
	 public int sub(int a, int b) {
		return a-b;
	}
	
}

public class AbstarctClassExample extends  Abstractclass{
	
	int add(int a, int b) {
		
		return a+b;
	}

	public static void main(String[] args) {
		
		
		AbstarctClassExample a=new AbstarctClassExample();
		System.out.println(a.add(2, 5));
		System.out.println(a.sub(8, 9));
		System.out.println(a.mutliply(5, 9));
		
	}

	

}
