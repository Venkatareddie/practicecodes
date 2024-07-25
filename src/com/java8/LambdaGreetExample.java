package com.java8;

interface Welcome{
	String display(String name);
}
public class LambdaGreetExample {

	public static void main(String[] args) {
		Welcome w=(name)->{
			return "Hello "+ name;
		};
		System.out.println(w.display("Venkat"));

	}

}
