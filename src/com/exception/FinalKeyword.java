package com.exception;

public class FinalKeyword {

	public final int age =26;
	void display()
	{
		age=34;
	}
	public static void main(String[] args) {
		FinalKeyword f=new FinalKeyword();
		f.display();;
		
	}

}
