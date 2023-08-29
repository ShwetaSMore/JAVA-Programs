package com.LoopingStatements;
import java.util.*;

public class ArmstrongN 
{
	Scanner sobj = new Scanner(System.in);
	
	public void ArmStrong()
	{
		System.out.println("Give the number : ");
		int No1 = sobj.nextInt();
		int temp = No1;
		int count = 0;
		int digit = 0;
		int total = 0;
	
		while(temp>0)
		{
			count++;
			temp = temp/10;
		}
		
		temp = No1;
		
		System.out.println("Count is : "+count);
		
		while(temp>0)
		{
			int sum = 1;
			digit = temp%10;
			for(int j=1;j<=count;j++)
			{
				sum = digit*sum;
			}
			total = total + sum;
			temp = temp/10;
		}
		System.out.println("total : "+ total);
		
		if(total==No1)
		{
			System.out.println("Number is Armstrong Number");
		}
		else
		{
			System.out.println("Number is NOT a ArmStrong Number");
		}
		
		
	}

}
