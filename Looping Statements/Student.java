package com.thisKeyword;

public class Student 
{
	String name;
	int id;
	float per;
	
	public Student(String name , int id, float per)
	{
		//this(name,id,per);
		this.name = name;
		this.id = id;
		this.per = per;
    }
	
	public void get()
	{
		this.name = "ram";
		this.name = "sham";
		System.out.println(this.name);
	}

}
