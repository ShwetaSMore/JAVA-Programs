package com.Pattern;

public class Pattern13 
{
	public void Patt()
	{
		int row = 5;
		int col = 5;
		
		for(int i=1;i<=row;i++)
		{
			for(int j = 1,k=5;j<=col;j++,k--)
			{
				if(j==i || k==i)
					System.out.print("@  ");
				else
					System.out.print("#  ");
					
			}
			System.out.println();
		}
	}

}
