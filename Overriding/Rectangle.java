package com.Overriding;

public class Rectangle extends shape
{
	int length;
	int breadth;
	
	
	Rectangle(String name,int length,int breadth)
	{
		super(name);
		this.breadth = breadth;
		this.length = length;
	}
	
	@Override
	public double area()
	{
		float area = length * breadth;
		return area;
	}
	
	@Override
	public double circumference()
	{
		float cir = 2*(length+breadth);
		return cir;
	}

}
