package com.operator;

public class PrimeN 
{
	public static void main(String[] args) 
	{
		
		int i=0;
		int j=0;
		int prime=0;
		
		for(i=2;i<=100;i++)
		{
			prime=0;
			
			for(j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					prime=1;
					break;
				}
			}
			
			if(prime==0)
			{
				System.out.print(i +" ");
			}
		}
		
			
		
	}

}
