package com.methodreference;

interface Greet{
	void welcome();
}
public class InstanceMethodReference {
	 
	public void greetWelcome()
	{
		System.out.println("Welcome to United States");
	}
	
	    public static void main(String[] args) {  
	    	
	    	InstanceMethodReference instanceMethodReference=new InstanceMethodReference();
	    	Greet g=instanceMethodReference::greetWelcome;
	    	g.welcome();
	}

}
