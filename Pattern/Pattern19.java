package com.Pattern;

public class Pattern19 
{
	public void Patt()
	{
		//int row = 5;
		//int col = 5;
		
		for(int i=1;i<=5;i++)
		{
			for(int j =5 ;j>=1;j--)
			{
				if(i>=j)
				{
					System.out.print("*  ");
				}
				else
				{
					System.out.print("   ");
				}
				 
					
			}
			System.out.println();
		}
	}

}
