package com.functionalinterfaces;

import java.util.function.Function;

public class FunctionInterface {
	//It represents a function that accepts one argument and returns a result back to the referred function.
	
	static String show(String message) 
	{
		return "Hello, "+message;
	}

	public static void main(String[] args) {
		Function<String,String> f=FunctionInterface::show;
		System.out.println(f.apply("Venkat"));
		
		

	}

}
