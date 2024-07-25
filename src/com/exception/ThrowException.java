package com.exception;

public class ThrowException {

	public static void main(String[] args) {
		int age =20;
		if (age<18)
		{
			throw new ArithmeticException("No eligible to cast the vote");
		}
		else
		{
			System.out.println("Eligilble to cast the vote");
		}

	}

}
