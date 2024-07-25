package com.collectionframework;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		Vector<Integer>al=new Vector<Integer>();
		al.add(3);
		al.add(5);
		al.add(6);
		al.add(9);
		
		Enumeration<Integer> e=al.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}

	}

}
