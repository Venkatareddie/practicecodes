package com.collectionframework;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		Map<Integer,String>map=new HashMap<Integer,String>();
		map.put(1, "Venkat");
		map.put(2, "Srinu");
		map.put(3, "Vishnu");
		map.put(4,"Vijay");
		
		System.out.println(map.get(3));
	map.replace(2, "KIRAN");
	System.out.println(map);
	
	System.out.println(map.containsKey(3));
	
		
	
	}

}
