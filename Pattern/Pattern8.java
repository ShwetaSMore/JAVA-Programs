package com.Pattern;

public class Pattern8 
{
	public void Patt()
	{
		int row = 5;
		//int col = 5;
		
		for(int i=1;i<=row;i++)
		{
			for(int j = 0;j<=9;j++)
			{
				if(j%2==0)
					System.out.print(j+  "  ");
					
			}
			System.out.println();
		}
	}

}
