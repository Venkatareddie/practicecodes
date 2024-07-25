package com.lambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Item{
	int id;
	String name;
	float price;

public Item(int id, String name,float price)
{
	this.id=id;
	this.name=name;
	this.price=price;
}
}

public class LamdaExpressionFIlterData {

	public static void main(String[] args) {
		List<Product>list=new ArrayList<Product>();
		list.add(new Product(1,"Samsung",35000f));
		list.add(new Product(2,"Nokia",23000f));
		list.add(new Product(2,"LG",27500f));
		
		Stream<Product>fdata=list.stream().filter(p->p.price>25000);
		
		fdata.forEach(product->System.out.println(product.id+" "+product.name+" "+product.price)
		);

	}


}
