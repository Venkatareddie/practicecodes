package com.collectionframework;

import java.util.*;
import java.util.List;


public class ArrayListExample2 {

	public static void main(String[] args) {
		
		List<String>al=new ArrayList<String>();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		al.add("E");
		
		al.add(3, "K");
		
		System.out.println(al);
		
	List<String>al2=new ArrayList<String>();
	al2.add("V");
	al2.add("N");
	al2.add("X");
	al2.add("Y");
	
	al.addAll(al2);
	System.out.println(al);
	
	System.out.println(al.contains(al2));
	System.out.println(al.get(3));
	System.out.println(al.indexOf("C"));

//	for(String str:al)
//	{
//		System.out.println(str);
//	}
al.remove(2);
al.retainAll(al2);
System.out.println(al);

Iterator i=al.iterator();
while(i.hasNext())
{
	System.out.println(i.next());
}

Collections.sort(al);
System.out.println(al);

ListIterator li=al.listIterator(al.size());

while(li.hasPrevious())
{
	System.out.println(li.previous());
}

for(int n=0;n<al.size();n++)
{
	System.out.println(al.get(n));
}
al.remove(2);
System.out.println(al);

al.removeAll(al2);
System.out.println(al);
	}

}
