package com.java8;

interface Multiplication
{
	int multi(int a , int b);
}
public class LambdaMulti {

	public static void main(String[] args) {
		
		Multiplication m=(a,b)->(a*b);
		System.out.println(m.multi(3, 5));
		
	}

}
