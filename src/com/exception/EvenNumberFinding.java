package com.exception;

class EvenAndOddNumberFindException extends Exception
{
	public EvenAndOddNumberFindException (String message)
	{
		super(message);
	}
}
class FindingService
{
	public void number(int num)throws EvenAndOddNumberFindException{
		
	if(num%2==1) 
	{
		throw new EvenAndOddNumberFindException("Odd number-"+ num);
	}
	System.out.println("Even number");
	}
}

public class EvenNumberFinding {

	public static void main(String[] args) {
		
		FindingService f = new FindingService();
		try {
			f.number(7);
		}
		catch(EvenAndOddNumberFindException e)
		{
			System.out.println("Number even or odd finding:"+e.getMessage());
		}
	}

}
