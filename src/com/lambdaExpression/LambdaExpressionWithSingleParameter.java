package com.lambdaExpression;

interface Employer{
	void employee(String empName);
}

public class LambdaExpressionWithSingleParameter {

	public static void main(String[] args) {
		
		Employer e=(empName)->{
			System.out.println("Employee Name: "+empName);
		};
		e.employee("Venkat Reddy");
		
	}

}
