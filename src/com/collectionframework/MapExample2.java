package com.collectionframework;

import java.util.HashMap;
import java.util.Map;

public class MapExample2 {

	public static void main(String[] args) {
		
		Map<Integer,String> map= new HashMap<Integer,String>();
		map.put(1, "Venkat");
		map.put(2, "Srinu");
		map.put(3, "Vishnu");
		map.put(4, "Kish");
		for(Map.Entry<Integer, String>entry:map.entrySet())
		{
			int i=entry.getKey();
			String val=entry.getValue();
			
			System.out.println(i+" "+val);
			
		}

	}

}
