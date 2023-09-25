package com.Abstraction;

public class square extends shape
{
	public square(String shape_name,String color,int sides)
	{
		super(shape_name,color,sides);
	}
	
	public void draw()
	{
		System.out.println("Shape : ");
		System.out.println(" --------");
		System.out.println("|        |");
		System.out.println("|        |");
		System.out.println("|        |");
		System.out.println("|        |");
		System.out.println(" --------");
		
	}
	
	public float cal_area(int sides)
	{
		float area = sides*sides;
		return area;
	}

}
