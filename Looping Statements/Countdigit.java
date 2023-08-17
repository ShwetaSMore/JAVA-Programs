package com.LoopingStatements;

public class Countdigit 
{
	public static void main(String[] args) 
	{
		int num = 4532;
		int count = 0;
		int i = 0;
		
		while(num>0)
		{
			i = num%10;
			count++;
			num = num/10;
		}
		
		System.out.println("Count of digits in number is : "+count);
		
	}

}
