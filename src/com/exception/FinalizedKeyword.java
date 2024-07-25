package com.exception;

public class FinalizedKeyword {

	public static void main(String[] args) {
		FinalizedKeyword f=new FinalizedKeyword();
		System.out.println(f.hashCode());
		f=null;
		System.gc();
		System.out.println("End of the garbage collection");

	}
	protected void finalize()
	{
		System.out.println("Called the finalize method()");
	}

}
