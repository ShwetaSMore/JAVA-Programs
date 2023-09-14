package com.Overriding;

public class Square extends shape 
{
	float side;
	
	Square(String name,float side)
	{
		super(name);
		this.side = side;
	}
	
	@Override
	public double area()
	{
		float area = side * side;
		return area;
	}
	
	@Override
	public double circumference()
	{
		float cir = 4 * side;
		return cir;
	}

}
