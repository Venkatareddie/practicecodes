package com.java8;

//Lambda which implements the functional interface
//Its also known as anomaly class.
@FunctionalInterface
interface Draw
{
	public void draw( );
}

public class LambdaExample {

	public static void main(String[] args) {
		int width=12;
		
		Draw d=()->
		{
			System.out.println("Draw:"+width);
		};
		d.draw();

	}

}
