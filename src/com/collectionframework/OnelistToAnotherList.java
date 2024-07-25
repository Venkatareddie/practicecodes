package com.collectionframework;

import java.util.ArrayList;
import java.util.LinkedList;

public class OnelistToAnotherList {

	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<Integer>();
		
		al.add(2);
		al.add(8);
		al.add(6);
		al.add(73);
		
		LinkedList<Integer>ll=new LinkedList<Integer>(al);
		ll.add(5);
		
		for(int listvalues:ll)
		{
			System.out.println(listvalues);
		}
		
	}

}
