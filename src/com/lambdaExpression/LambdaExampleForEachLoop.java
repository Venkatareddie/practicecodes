package com.lambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class LambdaExampleForEachLoop {

	public static void main(String[] args) {
		
		List<String>l=new ArrayList<String>();
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("D");
		l.add("E");
		
		l.forEach((n)->System.out.println(n)
		);
	}

}
