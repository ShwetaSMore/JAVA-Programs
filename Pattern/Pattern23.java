package com.Pattern;

public class Pattern23 
{
	public void Patt()
	{
		char row = 'E';
		char col = 'E';
		
		
		
		for(char i='A';i<=row;i++)
		{
			for(char j=col,k='A';j>='A';j--)
			{
			
				if(i>=j) 
				{
					System.out.print(k+"  ");
					k++;
				
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
