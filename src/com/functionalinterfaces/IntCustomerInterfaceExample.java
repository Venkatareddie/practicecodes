package com.functionalinterfaces;

import java.util.function.IntConsumer;

public class IntCustomerInterfaceExample {
	
	//Function which takes only one int type argument but doesn't return any value.

	public static void main(String[] args) {
		
		IntConsumer i=a->System.out.println(a*10);
		i.accept(10);
	}

}
