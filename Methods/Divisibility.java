package com.Methods;

public class Divisibility 
{
	
	public void getDigit()
	{
		int sum = 0;
		
		for(int i=300;i<=350;i++)
		{
			if(i%3==0)
			{
				sum = sum + i;
			}
		}
		System.out.println("Sum of digits divisible by 3 is : "+sum);
	}

}
