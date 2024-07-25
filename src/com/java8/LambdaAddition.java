package com.java8;

interface Addition{
	int add(int a,int b);
}
public class LambdaAddition {

	public static void main(String[] args) {
		Addition ad=(a,b)->{
			return a+b;
		};
		
		System.out.println(ad.add(2, 3));
	}

}
