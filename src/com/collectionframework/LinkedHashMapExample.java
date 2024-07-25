package com.collectionframework;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		
		//It is same like HashMap and only difference both key and value having null will not be allowed.
		//Maintaining the order.
		// if keys are duplicated the latest key and value will be considered into  output.
		//LinkedHampMap is accepts the heterogeneous data elements.
		
		LinkedHashMap <Integer, String> lh=new LinkedHashMap <Integer, String>();
		lh.put(1, "A");
		lh.put(2, "B");
		lh.put(3, "C");
		lh.put(4, "C");
		lh.put(2, "D");
		lh.put(null, null);
		lh.put(null, "E");
		
		System.out.println(lh);
		
		for(Map.Entry map:lh.entrySet())
		{
			System.out.println(map.getKey()+":"+map.getValue());
		}
		lh.remove(2);
		System.out.println(lh);
		System.out.println(lh.size());
		System.out.println(lh.containsKey(9));
		

	}

}
