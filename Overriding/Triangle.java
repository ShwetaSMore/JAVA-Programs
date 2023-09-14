package com.Overriding;

public class Triangle extends shape
{
	float height;
	float base;
	float a, b, c;
	
	Triangle(String name,float height,float base,float a,float b,float c)
	{
		super(name);
		this.base = base;
		this.height = height;
		this.a = a;
		this.b = b;
		this.c = c;
		
	}
	
	@Override
	public double area()
	{
		float area = (height*base)/2;
		return area;
	}
	
	@Override
	public double circumference()
	{
		float cir = a+b+c;
		return cir;
	}

}
