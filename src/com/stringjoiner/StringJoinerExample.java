package com.stringjoiner;

import java.util.StringJoiner;

public class StringJoinerExample {

	public static void main(String[] args) {
		StringJoiner j=new StringJoiner(", ","[","]");
		j.add("Venkat");
		j.add("Vishnu");
		j.add("Srinu");
		j.add("Ram");
		j.add("Vijay");
		
		System.out.println(j);

	}

}
