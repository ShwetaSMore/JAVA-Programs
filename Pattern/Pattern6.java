package com.Pattern;

public class Pattern6 
{
	public void Patt()
	{
		int row = 5;
		//int col = 5;
		
		for(char ch = 'a';ch<='e';ch++)
		{
			for(int i=1;i<=row;i++)
			{
				System.out.print(ch+  "  ");
			}
			System.out.println();
		}
	}

}
