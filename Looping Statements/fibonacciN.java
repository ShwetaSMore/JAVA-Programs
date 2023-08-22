package com.LoopingStatements;

public class fibonacciN 
{
	public static void logic()
	{
		int No1 = 1;
		int No2 = 1;
		int No3 = 0;
		System.out.println(No1);
		
		for(int i=1;i<=10;i++)
		{
			No3 = No1+No2;
			System.out.println(No3);
			No1 = No2;
			No2 = No3;
		}
	}
	
	public static void main(String[] args) 
	{
		fibonacciN.logic();
		
	}

}
