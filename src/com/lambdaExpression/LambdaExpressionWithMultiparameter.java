package com.lambdaExpression;

interface Company
{
	void employee(int empId, String empName, int empSal);
}
public class LambdaExpressionWithMultiparameter {

	public static void main(String[] args) {
		
		 Company e=(empId,empName,empSal)->{
			System.out.println("Employee Id: "+empId+" Employee Name: "+empName+" Employee Salary: "+empSal);
			
		};
		e.employee(101, "Venkat", 55000);
		
	}

}
