package com.collectionframework;
import java.util.*;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		
	// We can use all the collection interface methods in this class. 
	// It is not allowing duplicates
	// Storing  the objects in ordered manner
	// It is allowing null values
	// It is accepts the homogeneous and heterogeneous data elements.
		
	LinkedHashSet<String> l=new LinkedHashSet<String>();
	l.add("Venkat");
	l.add("Srinu");
	l.add("Vishnu");
	l.add("Rahul");
	l.add("Venkat");
	l.add("1");
	l.add(null);
	
	System.out.println(l);
		
		

	}

}
