package com.collectionframework;

import java.util.*;

//Why collection framework?
// Java collection framework is one stop solution on manipulating the objects such as adding, searching, sorting, deleting, updating.

//****************Arrays***********************************

// Arrays is fixed in size, we can't modify the size after fixed.
// Array  can hold only homogeneous data type elements.
// With respect to  performance array is good to use.
// Array can hold objects and as well non primitives data.
// Write in memory array are not recommended to use.

//*****************Collection*******************************

//Collection has a growable in nature. we can do increase and decrease size of size based on requiements.
// Write in memory collections is recommended to use.
// With respect to performance, collection is not recommended to use.
// Collection can hold only objects and not primitives data like int, char, short etc..
// Collection can hold both homogeneous and heterogeneous objects.

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();	
		al.add(3);
		al.add(5);
		al.add(9);
		al.add(1);
		
		Iterator i=al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
 
}
