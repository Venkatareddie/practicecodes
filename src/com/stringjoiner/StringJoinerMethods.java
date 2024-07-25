package com.stringjoiner;

import java.util.StringJoiner;

public class StringJoinerMethods {

	public static void main(String[] args) {
		StringJoiner j=new StringJoiner(",");
		j.add("Venkat");
		j.add("Ram");
		
		j.setEmptyValue("It is empty");
		System.out.println(j);
		
		int length=j.length();
		System.out.println("Length :"+length);
		
		String str =j.toString();
		System.out.println(str);
		
		char ch=str.charAt(3);
		System.out.println("Character at index 3 is :"+ch);
		
		j.add("Vishnu");
		System.out.println(j);
		
		int Newlength=j.length();
		System.out.println("New Length Value :"+Newlength);
	}

}
