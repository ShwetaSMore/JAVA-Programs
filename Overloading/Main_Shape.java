package com.overloading;

public class Main_Shape 
{
	public static void main(String[] args) 
	{
		Shape sobj = new Shape();
		
		float a = sobj.Area(12);
		System.out.println("Area of Square : "+a);
		
		float b = sobj.Area(4.5f, 23);
		System.out.println("Area of Rectangle : "+b);
		
		float c = sobj.Area(52.1f, 4.1f);
		System.out.println("Area of Triangle : "+c);
		
		double d = sobj.Area(4.5f);
		System.out.println("Area of Circle : "+d);
		 
		
	}

}
