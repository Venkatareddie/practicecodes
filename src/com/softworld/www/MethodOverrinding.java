package com.softworld.www;

public class Sep
{
	public int m1(int a, int b)
	{
		return a*b;
	}
	public int m1(int a, int b, int c)
	{
		return a *b*c;
	}
}
	
	public class Diff {
		
		public int m1(int a, int b)
		{
			return a*b;
		}
		public int m1(int a, int b, int c)
		{
			return a*b*c;
		}
	
	}
}

class MethodOverrinding {
	public static void main(String[] args) {
		

		MethodOverrinding m =new MethodOverrinding();
		System.out.println(m.m1(2, 4));
		System.out.println(m.m1(2, 4,6));
		
		Diff d = new Diff();
		System.out.println(d.m1(3, 6));
		System.out.println(d.m1(3, 6,8));
		
	} 

}

