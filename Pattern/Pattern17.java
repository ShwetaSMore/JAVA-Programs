package com.Pattern;

public class Pattern17 
{
	public void Patt()
	{
		int row = 5;
		int col = 5;
		
		for(int i=1;i<=row;i++)
		{
			for(int j =col ;j>=i;j--)
			{
				System.out.print("*  ");
					
			}
			System.out.println();
		}
	}

}
