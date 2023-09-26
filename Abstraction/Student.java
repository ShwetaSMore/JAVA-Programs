package com.Abstraction;

public abstract class Student 
{
	String name;
	int id;
	int std;
	
	
	public Student(String name,int id,int std)
	{
		this.name = name;
		this.id = id;
		this.std = std;
	}
	
	public abstract float total_marks(float eng,float hindi,float maths,float mar);
	
	public abstract float percentage();
	
	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Id   : "+id);
		System.out.println("STD  :"+std);
	}

}
