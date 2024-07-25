package com.collectionframework;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		Set<Integer> s=new HashSet<Integer>();
		s.add(3);
		s.add(6);
		s.add(9);
		s.add(4);
		s.add(6);
		
		System.out.println(s);
		
		System.out.println(s.isEmpty());
		System.out.println(s.remove(3));
		System.out.println(s);
		Set<Integer> s1=new HashSet<Integer>();
		s1.add(10);
		s1.add(2);
		s1.add(5);
		s1.add(7);
		s1.add(6);
		
		System.out.println(s.containsAll(s1));
		System.out.println(s.contains(19));
		System.out.println(s.removeAll(s1));
		System.out.println(s);
		
		for(int i:s1)
		{
			System.out.println(i);
		}
		
	}

}
