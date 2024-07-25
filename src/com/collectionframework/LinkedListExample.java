package com.collectionframework;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	//LinkedList can hold the duplicates
	//It does not maintain the order.
	//Its supports both homogeneous and heterogeneous objects
	// It is similar to linkedlist in data structures. 
	// In linkedlist can use the collection methods.
	public static void main(String[] args) {
		LinkedList<String>ll=new LinkedList<String>();
		
		ll.add("venkat");
		ll.add("vishnu");
		ll.add("srinu");
		ll.add("venkat");
		
//		for(String details:ll)
//		
//		System.out.println(details);
		
		LinkedList<String> l2=new LinkedList<String>();
		l2.add("vishnu");
		l2.add("ram");
		l2.add("mahesh");
		
		ll.add("krish");
		System.out.println(ll);
		
		ll.addAll(l2);
		System.out.println(ll);
		
		System.out.println(ll.isEmpty());
		System.out.println(ll.contains("vishnu"));
		System.out.println(ll.size());
		System.out.println(ll.peek());
		System.out.println(ll.pop());
		ll.addFirst("Jimmy");
		System.out.println(ll);
		ll.addLast("Tom");
		System.out.println(ll);
		ll.removeFirst();
		System.out.println(ll);
		System.out.println(ll.removeAll(l2));
		System.out.println(ll);
		System.out.println(ll.equals(l2));
		System.out.println(ll.getFirst());
		System.out.println(ll.indexOf("Tom"));
		System.out.println(ll.removeFirst());
		System.out.println(ll.get(2));
		System.out.println(ll.isEmpty());
		
		
	}

}
