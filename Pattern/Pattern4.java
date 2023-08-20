package com.Pattern;

public class Pattern4 
{
	public void Patt()
	{
		int row = 5;
		int col = 5;
		
		for(int i=1;i<=row;i++)
		{
			for(int j =col;j>=1;j--)
			{
				System.out.print(j+  "  ");
			}
			System.out.println();
		}
	}

}
