package com.functionalinterfaces;

import java.util.function.Supplier;

public class SupplierInterface {
	
	public static void main(String[] args) {
		
		Supplier<String>s=new Supplier<String>() {
			public String get()
			{
				return "Helloo";
			}
			
		};
		System.out.println(s.get());
		
		

	}

}
