package com.LoopingStatements;

public class AddPal100_500 
{
	public void palindrome()
	{
		int no1 = 100;
		int no2 = 500;
		int digit = 0;
		int sum = 0;
		
		for(int i = no1;i<=no2;i++)
		{
			no1 = i;
			digit = 0;
			while(i>0)
			{
				digit = (digit*10) + (i%10);
				i = i/10;
			}
			i = no1;
			
			if(digit==i)
			{
				sum = sum + digit;
			}
			
		}
		System.out.println("Sum of Palindrome Numbers is : "+sum);
	}

}
