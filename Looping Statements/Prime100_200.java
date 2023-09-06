package com.LoopingStatements;

public class Prime100_200 
{
	public void isPrime()
	{
		int no1 = 100;
		int no2 = 200;
		int isPrime = 0;
		
		for(int i = no1;i<=no2;i++)
		{
			isPrime = 0;
			for(int j = 1;j<=i;j++)
			{
				if(i%j==0)
				{
					isPrime++;
				}
				
			}
			
			if(isPrime==2)
			{
				System.out.print(i+" ");
			}	
			
		}
	}
}
