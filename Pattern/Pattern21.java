package com.Pattern;

public class Pattern21 
{
	public void Patt()
	{
		int row = 5;
		int col = 5;
		
		
		for(int i=row;i>=1;i--)
		{
			for(int j=col;j>=1;j--)
			{
				if(i<=j) 
				{
					System.out.print(j+"  ");
				}
				
					
			}
			System.out.println();
		}
	}

}
