package com.ControlStatements;

public class Student 
{
	public static void main(String[] args) 
	{
		float eng = 45.5f;
		float mar = 67.4f;
		float hindi = 97.8f;
		float sci = 99.3f;
		float math = 69;
		
		
	
		float total = eng+mar+hindi+sci+math;
		float per = total/5;
		
		if(per>=35)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
	}

}
