package com.ControlStatements;

public class Min_Num 
{
	public static void main(String[] args) 
	{
		int a = 17;
		int b = 3;
		int c = 4;
		
		if(a<b && a<c)
		{
			System.out.println(a + " is a min number.");
		}
		else if(b<a && b<c)
		{
			System.out.println(b + " is a min number.");
		}
		else
		{
			System.out.println(c + " is a min number.");
		}
	}

}
