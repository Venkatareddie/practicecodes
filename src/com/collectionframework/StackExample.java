package com.collectionframework;

import java.util.Iterator;
import java.util.Stack;

public class StackExample {

	//stack class model and  implements  the stack data structure.
	// This class based on the principle of LIFO.
	// By based on stack we can do push and pop operations.
	// In addition to stack we can do search, empty and peak.
	
	public static void main(String[] args) {
		Stack<String> s=new Stack<String>();
		s.push("venkat");
		s.push("vijay");
		s.push("ram");
		s.push("venkat");
		
		Iterator<String> itr=s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		s.pop();
		
		System.out.println(s);

	}

}
