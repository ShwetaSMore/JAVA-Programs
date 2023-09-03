package com.LoopingStatements;

public class Sum_Digit 
{
	public static void main(String[] args) 
	{
		int num = 1234;
		int digit = 0;
		int sum = 0;
		
		
		while(num>0)
		{
			digit = num%10;
			sum = sum + digit;
			num = num/10;
			
		}
		
		System.out.println("Sum of given digit is : "+sum);
		
	}

}
