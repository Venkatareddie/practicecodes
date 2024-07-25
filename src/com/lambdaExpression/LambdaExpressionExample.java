package com.lambdaExpression;

interface Icecream{
	void cream();
}

public class LambdaExpressionExample {

	public static void main(String[] args) {
		
		String item="Chocolate";
		Icecream i=()->{
			System.out.println("Icecream :"+item);
		};
		i.cream();
		

	}

}
