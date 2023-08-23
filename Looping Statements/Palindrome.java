package com.LoopingStatements;

public class Palindrome 
{	
	public void PallindromeN() 
	{
		int num = 121;
		int digit = 0;
		int num1 = num;
		
		while(num>0)
		{
			digit = (digit*10) + (num%10);
			num = num/10;	
		}
		
		if(digit==num1)
		{
			System.out.println("Given number is a palindrome number.");
		}
		else
		{
			System.out.println("Given number is not a palindrome number.");
		}
		
	}

}
