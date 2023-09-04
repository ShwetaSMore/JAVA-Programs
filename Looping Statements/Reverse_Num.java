package com.LoopingStatements;

public class Reverse_Num 
{
	public static void main(String[] args) 
	{
		int num = 4563;
		int digit = 0;
		int i = 0;
		
		while(num>0)
		{
			digit = (digit*10)+num%10;
			num = num/10;			
		}
		
		System.out.println(digit);
		
	}

}
