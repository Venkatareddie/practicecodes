package com.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

public class UserDefinedArrayList {

	public static void main(String[] args) {
		Student s1= new Student(2,"venkat",26,6000);
		Student s2= new Student(3,"vishnu",21,4000);
		
		ArrayList l=new ArrayList();
		
		l.add(s1);
		l.add(s2);
		
		Iterator itr=l.iterator();
		while(itr.hasNext())
		{
			Student s=(Student) itr.next();
			
			System.out.print("Student Id = "+s.sid);
			System.out.print("Student name = "+s.sname);
			System.out.print("Studnet age = "+s.sage);
			System.out.print("Studnet sal = "+s.ssal);
		}
		
	}

}
