package com.collectionframework;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		
		//Tree Map contains values based keys. it implements by navigable interface and extends with abstract map
		//Tree Map contains only unique elements
		//Tree map  cannot have null keys and have multiple null values allowed
		//tree map maintain the order in ascending order.
		//Tree map is non synchronous
		
		TreeMap<Integer,String> tm=new TreeMap<Integer, String>();
		tm.put(1, "A");
		tm.put(2, "B");
		tm.put(3,"C");
		tm.put(4, "D");
		tm.put(3, "E");
//		tm.put(null, null);
		
		System.out.println(tm);
		
		System.out.println(tm.firstEntry());
		
		for(Map.Entry map:tm.entrySet())
		{
			System.out.println(map.getKey()+ ":"+map.getValue());
		}
		System.out.println(tm.descendingMap());	 
		System.out.println(tm.isEmpty());
		System.out.println(tm.size());
		System.out.println(tm.containsKey(6));
	}

}
