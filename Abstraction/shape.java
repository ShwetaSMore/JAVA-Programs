package com.Abstraction;

public abstract class shape 
{
	String shape_name;
	String color;
	int sides;
	
	public shape(String shape_name,String color,int sides)
	{
		this.shape_name = shape_name;
		this.color = color;
		this.sides = sides;
	}
	
	public abstract void draw();
	
	public abstract float cal_area(int sides);

}
