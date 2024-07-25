package com.collectionframework;

import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class HashTableExample {
	
	//HashTble contains only unique elements
	//No null key or values allowed in the hash table
	//Hash table is synchronous.
	//Hash Table maintain the ascending order
	// The initial default capacity of hash table is 11.
	public static void main(String[] args) {
		Hashtable<Integer,String> tm=new Hashtable<Integer, String>();
		tm.put(1, "A");
		tm.put(2, "B");
		tm.put(3,"C");
		tm.put(4, "D");
		tm.put(3, "E");
//		tm.put(null, null);
//		tm.put(6, null);
		System.out.println(tm);
		tm.remove(3);
		System.out.println(tm);
		System.out.println(tm.get(4));
		
		Hashtable<Integer,String> t=new Hashtable<Integer, String>();
		t.put(1, "Venkat");
		t.put(2, "Vishnu");
		t.put(3,"Srinu");
		t.put(4, "Ram");
		t.put(3, "Vijay");
		
		System.out.println(tm.contains(t));
		
		for (Map.Entry m:t.entrySet())
		{
			System.out.println(m.getKey()+" :"+m.getValue());
		}
		System.out.println(t.equals(tm));
		System.out.println(t.size());
		System.out.println(t.toString());
		
		
	}

}
