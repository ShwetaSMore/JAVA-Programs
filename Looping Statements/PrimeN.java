package com.LoopingStatements;
import java.util.*;

public class PrimeN 
{
	public static void main(String[] args) 
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int iNum = sobj.nextInt();
		int isPrime = 0;
		
		for(int i=2;i<=iNum;i++)
		{
			if(iNum%i==0)
			{
				isPrime++;
			}
		}
		
		if(isPrime==1)
		{
			System.out.println("Given number is a Prime number.");
		}
		else
		{
			System.out.println("Given number is not a Prime number.");
		}
		
	}

}
