package com.Overriding;

public class Circle extends shape
{
	float radius;
	
	Circle(String name,float radius)
	{
		super(name);
		this.radius = radius;
	}
	
	@Override
	public double area()
	{
		double area = 3.14*radius*radius;
		return area;
	}
	
	@Override
	public double circumference()
	{
		double cir = 2*3.14*radius;
		return cir;
	}

}
