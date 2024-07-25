package com.collectionframework;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample1 {
	
	//Tree set not allowing the null values.
	//Tree set  does not allowing the duplicates.
	//Tree set objects stored in ordered manner.
	//objects of the TreeSet class are stored in ascending order.
	//TreeSet class is non synchronized.
	

	public static void main(String[] args) {
		TreeSet<Integer> ts= new TreeSet<Integer>();
		ts.add(4);
		ts.add(9);
		ts.add(2);
		ts.add(7);
		ts.add(3);
		ts.add(2);
		//ts.add(null);
		
		System.out.println(ts);
		
		Iterator itr=ts.iterator();
		while(itr.hasNext())
		{
			int values =(int) itr.next();
			System.out.println(values);
		}
		System.out.println("-------------------------------------");
		
		Iterator i=ts.descendingIterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		System.out.println("--------------------------------------");
		
		System.out.println(ts.pollFirst());
		System.out.println(ts.pollLast());
		System.out.println(ts.equals(4));
		
		System.out.println(ts.tailSet(7,true));
		System.out.println(ts.tailSet(9, true));
		


	}

}
