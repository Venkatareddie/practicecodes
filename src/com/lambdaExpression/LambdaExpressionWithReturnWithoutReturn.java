package com.lambdaExpression;

interface Addition {
	int add(int a, int b);
}

public class LambdaExpressionWithReturnWithoutReturn {

	public static void main(String[] args) {
		
		Addition ad=(a,b)->(a+b);
		System.out.println(ad.add(2, 3));
		
		Addition ad1=(a,b)->
		{
			return (a+b);
		};
		System.out.println("Addition of two  numbers:"+ ad1.add(4, 9));
		

	}

}
