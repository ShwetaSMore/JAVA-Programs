package com.operator;

public class Area 
{
	public static void main(String[] args)
	{
		int l = 10;
		int b = 35;
		float r = 3.5f;
		
		int area1 = l*l;
		System.out.println("Area of Square: "+ area1);
		
		int area2 = (l*b)/2;
		System.out.println("Area of Triangle: "+area2);
		
		int area3 = l*b;
		System.out.println("Area of Rectangle: "+area3);
		
		float area4 = 3.14f*r*r;
		System.out.println("Area of Circle: "+area4);
		
		float area5 = 2*3.14f*r;
		System.out.println("Circumference of Circle: "+area5);
		
		
	}

}
