package com.overloading;

public class Shape 
{
	float area;
	
	public float Area(int side)
	{
		area = side*side;
		return area;
	}
	
	public float Area(float length,int breadth)
	{
		area = length*breadth;
		return area;
	}
	
	public float Area(float height,float base)
	{
		area = (height*base)/2;
		return area;
	}
	
	public double Area(float radius)
	{
		double area = 3.14*radius*radius;
		return area;
	}
	
	

}
