package com.LoopingStatements;

public class Add_Even 
{
	public static void main(String[] args) 
	{
		int even = 0;
		
		for(int i=10;i<=20;i++)
		{
			if(i%2==0)
			{
				even = even+i;
			}
		}
		
		System.out.println("Addition of Even numbers with for loop is : "+even);
		
		int even1 = 0;
		int i1 = 10;
		
		while(i1<=20)
		{
			if(i1%2==0)
			{
				even1 = even1+i1;
			}
			i1++;
			
		}
		System.out.println("Addition of Even numbers with while loop is : "+even1);
				
	}
	
	

}
