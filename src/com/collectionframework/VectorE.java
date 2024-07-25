package com.collectionframework;

import java.util.Vector;

public class VectorE {

	// Vector is similar to arrays  and it has some lagacy methods and that does not contain the collection framework
	// Vector is synchonizable nature.
	//	Vector is a dynamic in nature which means it can grow as required.
	// Vector components can accessed by using the index number.
	public static void main(String[] args) {
		Vector<Integer>v=new Vector<Integer>();
		for(int i=1;i<=10;i++) {
			v.add(i);
			}
		System.out.println(v);
		
		v.remove(4);
		System.out.println(v);
		
		for(int i=1;i<v.size();i++) {
			System.out.println(v.get(i));
		}
		
	}

}
