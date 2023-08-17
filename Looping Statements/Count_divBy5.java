package com.LoopingStatements;

public class Count_divBy5 
{
	public static void main(String[] args) 
	{
		int count = 0;
		
		for(int i=50;i<=100;i++)
		{
			if(i%5==0)
			{
				count++;
			}
		}
		
		System.out.println("Count of numbers divisible by 5 in between range 50-100 is : "+count);
		
	}

}
