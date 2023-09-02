package com.overloading;

public class MatematicalOP 
{
	public int operation(int a,int b)
	{
		int c = a+b;
		return c;
	}
	
	public int operation(int a, byte b)
	{
		int c = a+b;
		return c;
	}
	
	public float operation(float a,int b,float c)
	{
		c = a*b;
		return c;
	}
	
	void operation(String a,String b)
	{
		System.out.println(a+b);
	}
	
	protected float operation(float a, float b)
	{
		float c = a/b;
		return c;
	}

}
