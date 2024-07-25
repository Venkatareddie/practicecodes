package com.functionalinterfaces;

import java.util.function.Predicate;

//It is functional interface which represents a predicate of the arguments.
//It is defined in the java.util package and having test() functional method.

public class PredicateInterfaceExample {
		
		static boolean chkage(int age)
		{
			if(age<18)
				return false;
				else
					return true;
		}
		public static void main(String[] args) {
			Predicate<Integer>p= PredicateInterfaceExample::chkage;
			boolean result= p.test(10);
			System.out.println(result);
	}

}
