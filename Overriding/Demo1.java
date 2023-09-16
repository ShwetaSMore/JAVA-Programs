package com.Overriding;

public class Demo1 extends Demo
{
	public Demo1(int a)
	{
		super(a);
	}
	
	@Override
	public void display()
	{
		System.out.println("In Demo1 Class");
	}

}
