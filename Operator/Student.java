package com.operator;

public class Student {
	
	public static void main(String[] args)
	{
		String name = "Shweta";
		int A = 78;
		int B = 88;
		int C = 98;
		int D = 95;
		int E = 85;
		
		int total_marks = (A+B+C+D+E);
		float percentage = (total_marks/5);
		
		System.out.println("Percentage of "+ name + " is "+percentage + " %");
	}

}

