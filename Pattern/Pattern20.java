package com.Pattern;

public class Pattern20 
{
	public void Patt()
	{
		int row = 5;
		//int col = 5;
		char ch = 'A';
		
		for(int i=1;i<=row;i++)
		{
			ch = 'A';
			for(int j=1;j<=5;ch++,j++)
			{
				if(i>=j) 
				{
					System.out.print(ch+"  ");
				}
				
					
			}
			System.out.println();
		}
	}

}
