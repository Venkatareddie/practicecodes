package com.softworld.www;

public class PrivateChild {

	public static void main(String[] args) {
		PrivateAccessModifier  p = new PrivateAccessModifier ();
		System.out.println(p.name);
		p.message();

	}

}
