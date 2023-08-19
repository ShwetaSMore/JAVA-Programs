package com.Pattern;

public class Pattern3 
{
	public void Patt()
	{
		int row = 5;
		//int col = 5;           A  B  C  D  E
		
		for(int i=1;i<=row;i++)
		{
			for(char ch = 'A';ch<='E';ch++)
			{
				System.out.print(ch+  "  ");
			}
			System.out.println();
		}
	}

}
