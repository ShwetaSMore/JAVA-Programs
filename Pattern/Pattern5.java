package com.Pattern;

public class Pattern5 
{
	public void Patt()
	{
		int row = 5;
		//int col = 5;
		
		for(int i=1;i<=row;i++)
		{
			for(char ch = 'e';ch>='a';ch--)
			{
				System.out.print(ch+  "  ");
			}
			System.out.println();
		}
	}

}
