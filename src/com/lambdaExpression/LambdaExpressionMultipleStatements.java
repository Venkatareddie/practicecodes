package com.lambdaExpression;

interface Quote{
	
	String greeting(String message);
}

public class LambdaExpressionMultipleStatements {

	public static void main(String[] args) {
		
		Quote q = (message)->
		
		{
			String st1 = "I love my country,";
			String st2 = st1+ message;
			return st2;
		};
		
		System.out.println(q.greeting("India!!!"));

	}

}
