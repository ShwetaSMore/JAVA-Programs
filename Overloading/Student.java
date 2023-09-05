package com.overloading;

public class Student 
{
	float total_Marks;
	float percent;
	String Name;
	
	public void getmarks(String name, float eng,float hindi,float maths)
	{
		Name = name;
		total_Marks = eng + hindi + maths;
		percent = total_Marks/3;
		display();
	}
	public void getmarks(String name, float eng,float hindi,float maths, float mar)
	{
		Name = name;
		total_Marks = eng + hindi + maths + mar;
		percent = total_Marks/4;
		display();
	}
	
	public void getmarks(String name, float eng,float hindi,float maths, float mar, float sci)
	{
		Name = name;
		total_Marks = eng + hindi + maths + mar + sci;
		percent = total_Marks/5;
		display();
	}
	
	public void display()
	{
		System.out.println("Student Name : "+Name);
		System.out.println("Total Marks : "+total_Marks);
		System.out.println("Percentage : "+percent+" %");
		System.out.println();
	}
	

}
