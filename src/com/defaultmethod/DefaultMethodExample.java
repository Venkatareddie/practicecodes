package com.defaultmethod;

interface Sayable{
	default void say() {
		System.out.println("This is default method");
	}
	void sayMore();
	static void sayLouder(){
		System.out.println("This sayLouder method");
	}
}
public class DefaultMethodExample implements Sayable
{
	public void sayMore() {
		System.out.println("This is sayMore method");
	}

	public static void main(String[] args) {
		
		DefaultMethodExample  d=new DefaultMethodExample ();
		d.say();
		d.sayMore();
		Sayable.sayLouder();

	}

}
