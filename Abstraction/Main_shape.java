package com.Abstraction;

public class Main_shape 
{
	public static void main(String[] args) 
	{
		square obj = new square("Square","black",8);
		
		obj.draw();
		float a = obj.cal_area(2);
		System.out.println("Area : "+a);
		
	}

}
