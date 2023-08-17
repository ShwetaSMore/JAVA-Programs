package com.LoopingStatements;

public class Add_Odd 
{
	public static void main(String[] args) 
	{
        int odd = 0;
		
		for(int i=10;i<=20;i++)
		{
			if(i%2==1)
			{
				odd = odd+i;
			}
		}
		
		System.out.println("Addition of odd numbers with for loop is : "+odd);
	}

}
