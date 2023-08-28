package com.Pattern;

public class Pattern15 
{
	public void Patt()
	{
		int row = 5;
		int col = 5;
		int k = 0;
		
		for(int i=1;i<=row;i++)
		{
			k = i;
			for(int j = 1;j<=col;j++,k++)
			{
				System.out.print(k + "  ");		
			}
			System.out.println();
			
		}
	}

}

/*
 * public void Patt()
	{
		int row = 5;
		int col = 5;
		
		
		for(int i=1;i<=row;i++)
		{
			
			for(int j = i;j<=i+4;j++)
			{
				System.out.print(j + "  ");		
			}
			System.out.println();
			
		}
	}
 */
