package com.Pattern;

public class Pattern12 
{
	public void Patt()
	{
		int row = 5;
		int col = 5;
		
		for(int i=1;i<=row;i++)
		{
			for(int j = col;j>=1;j--)
			{
				if(j==i)
					System.out.print("@  ");
				else
					System.out.print("#  ");
					
			}
			System.out.println();
		}
	}

}
