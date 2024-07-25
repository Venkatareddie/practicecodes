package com.lambdaExpression;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Product{
	int id;
	String name;
	float price;
	
	public Product(int id, String name, float price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
		
	}
}
public class LambdaExpressionComparator {

	public static void main(String[] args) {
		
		List<Product>l= new ArrayList<Product>();
		l.add(new Product(1,"Dove",18));
		l.add(new Product(2,"Santoor",13));
		
		Collections.sort(l,(p1,p2)->{
			return p1.name.compareTo(p2.name);
					
		});
		for(Product p:l)
			{
		System.out.println(p.name+" "+p.id+" "+p.price);	
		
		}
		
		
		
	}

}
