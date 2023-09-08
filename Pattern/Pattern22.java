package com.Pattern;

public class Pattern22 
{
	public void Patt()
	{
		char row = 'e';
		char col = 'e';
		
		
		for(char i=row;i>='a';i--)
		{
			for(char j=col;j>='a';j--)
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
