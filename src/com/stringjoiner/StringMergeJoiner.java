package com.stringjoiner;

import java.util.StringJoiner;

public class StringMergeJoiner {

	public static void main(String[] args) {
		
		StringJoiner j1=new StringJoiner(", ","[","]");
		j1.add("Venkat");
		j1.add("Ram");
		
		StringJoiner j2=new StringJoiner(" : ","[","]");
		j2.add("Srinu");
		j2.add("Vishnu");
		
		StringJoiner m=j1.merge(j2);
		System.out.println(m);

	}

}
