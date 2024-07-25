package com.functionalinterfaces;

import java.util.function.BiConsumer;

public class BiConsumerInterface {
	
	static void show(int id, String name)
	{
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		
		BiConsumer <Integer,String> bi= BiConsumerInterface::show;
		bi.accept(1, "Venkat");
		
		BiConsumer<Integer,String>b=(id,name)->System.out.println(id+ " "+name);
		b.accept(2, "Reddy");

	}

}
