package com.lambdaExpression;

interface Drawable{
	public void draw();
}

public class WithoutLambdaExpression {

	public static void main(String[] args) {
		Drawable d=new Drawable()
		{
			int width=10;
			public void draw()
			{
				System.out.println("Drawing:"+width);
			}
		};
		d.draw();
		
		
		

	}

}
