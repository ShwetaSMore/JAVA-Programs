package com.Constructor;

public class Demo 
{
	int a;
	float b;
	String c;
	
	/*public Demo()                Non Parameterized Constructor
	{
		a = 10;
		b = 23.3f;
		c = 'A';
	}*/
	
	/*
	 * Demo()                        Default constructor
	 * {
	 * 
	 * }
	 */
	
	
	public Demo(int a1,float b1,String c1)       //Parameterized constructor
	{
		a = a1;
		b = b1;
		c = c1;
	}
	
	public void display()
	{
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
	}

}
