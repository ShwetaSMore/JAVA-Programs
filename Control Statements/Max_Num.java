package com.ControlStatements;

public class Max_Num 
{
	public static void main(String[] args) 
	{
		int a = 17;
		int b = 33;
		int c = 47;
		
		if(a>b && a>c)
		{
			System.out.println(a + " is a max number.");
		}
		else if(b>a && b>c)
		{
			System.out.println(b + " is a max number.");
		}
		else
		{
			System.out.println(c + " is a max number.");
		}
	}

}
