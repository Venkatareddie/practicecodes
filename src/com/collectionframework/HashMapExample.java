package com.collectionframework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		
		
		//In Map concept we iterator not support to  traverse the elements, instead we have to use keySet() and entrySet() methods.
		//Accepting both key and the values to be null.
		//Duplicates keys are accepting but latest key  and its value giving as the output.
		//HAshMap supports the homogeneous and heterogeneous objects.
		//Values can do duplicate and key cannot do the duplicate.
		//HashMap maintain no order
		
		
		HashMap<Integer,String>hm=new HashMap<Integer, String>();
		hm.put(1, "venkat");
		hm.put(2, "Vishnu");
		hm.put(3, "Srinu");
		hm.put(4, "Ram");
		hm.put(null, null);
		hm.put(1, "Venkat");
		hm.put(5, "Vishnu");
		System.out.println(hm);
		
		Set set=hm.entrySet();
		Iterator itr=set.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry map= (Map.Entry)itr.next();
			System.out.println(map.getKey()+ " "+map.getValue());
		}
		hm.replace(3, "john");
		System.out.println(hm);
		hm.remove(3);
		System.out.println(hm);
		
		for(Map.Entry m: hm.entrySet())
{
	System.out.println(m.getKey()+" "+m.getValue());
}
		

	}

}
