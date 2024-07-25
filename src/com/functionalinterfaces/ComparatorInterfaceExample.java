package com.functionalinterfaces;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorInterfaceExample {

	public static void main(String[] args) {
		Comparator<String>c=new Comparator<String>() {
			public int compare(String s1,String s2)
			{
				return s1.length()-s2.length();
			}
		};
		String[] strings = {"apple", "banana", "cherry", "date"};
        Arrays.sort(strings, c);
        
        for (String s : strings) {
            System.out.println(s);
        }

	}

}
