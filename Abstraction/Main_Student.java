package com.Abstraction;

public class Main_Student 
{
	public static void main(String[] args) 
	{
		Student_info obj = new Student_info("Shweta",101,10);
		
		obj.display();
		
		float iret = obj.total_marks(53.4f, 85, 96, 75);
		System.out.println("Total Marks : "+iret);
		
		float iret1 = obj.percentage();
		System.out.println("Percentage : "+iret1+"%");
	}

}
