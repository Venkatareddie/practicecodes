package com.softworld.www;

public class PuppyInstance {
	private int puppyAge;
	
	
	public int getPuppyAge()
	{
		return puppyAge;
	}
	public void setPuppyAge(int puppyAge)
	{
		this.puppyAge=puppyAge;
	}

	public static void main(String[] args) {
		PuppyInstance p=new PuppyInstance();
		p.setPuppyAge(3);
		System.out.println(p.getPuppyAge());

	}

}
