package com.Pattern;

public class Pattern7 
{
	public void Patt()
	{
		int row = 5;
		int col = 10;
		
		for(int i=1;i<=row;i++)
		{
			for(int j = 1;j<=col;j++)
			{
				if(j%2==1)
					System.out.print(j+  "  ");
					
			}
			System.out.println();
		}
	}

}
