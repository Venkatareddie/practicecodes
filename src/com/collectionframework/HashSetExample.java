package com.collectionframework;

import java.util.HashSet;

public class HashSetExample {
	
	// Set is not allowed duplicates to store.
	// HashSet allowing duplicates.
	// In HashSet objects are stores unordered manner.
	// It supports homogeneous and heterogeneous object to store.
	
	public static void main(String[] args) {
		HashSet<String> h=new HashSet<String>();
		
		h.add("A");
		h.add("B");
		h.add("C");
		h.add("D");
		h.add("E");
		h.add("A");
		h.add("C");
		h.add(null);
		
		System.out.println(h);
	}

}
