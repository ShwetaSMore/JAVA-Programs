package com.Overriding;

public class shape 
{
	String name;
	
	shape(String name)
	{
		this.name = name;
		System.out.println("For "+name);
	}
	
	public double area()
	{
		return 0;
	}
	
	public double circumference()
	{
		return 0;
	}
}
