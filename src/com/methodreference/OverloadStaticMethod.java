package com.methodreference;

import java.util.function.BiFunction;

class Arithematic
{
	public static int add(int a, int b)
	{
		return a+b;
	}
	public static float add(int a,float b)
	{
		return a+b;
	}
}

public class OverloadStaticMethod {

	public static void main(String[] args) {
		
		BiFunction<Integer,Float, Float> adder=Arithematic::add;
		float result1=adder.apply(3, 5.6f);
		
		System.out.println(result1);
		
		
		

	}

}
