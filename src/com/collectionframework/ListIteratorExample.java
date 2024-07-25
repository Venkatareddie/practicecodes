package com.collectionframework;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {
		List<Integer>l=new ArrayList<Integer>();
		l.add(3);
		l.add(5);
		l.add(7);
		l.add(9);
		
		System.out.println(l);
		
		ListIterator<Integer> lit=l.listIterator();
		while(lit.hasNext())
		{
			System.out.println(lit.nextIndex()+" "+lit.next() );
		}
		
		while(lit.hasPrevious())

		{
			System.out.println(lit.previousIndex()+" "+lit.previous());
		}
	}

}
