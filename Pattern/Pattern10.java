package com.Pattern;

public class Pattern10 
{
	public void Patt()
	{
		int row = 5;
		int col = 5;
		
		for(int i=1;i<=row;i++)
		{
			for(int j = 1;j<=col;j++)
			{
				if(j==1 || j==5)
					System.out.print("#  ");
				else
					System.out.print("*  ");
					
			}
			System.out.println();
		}
	}

}
