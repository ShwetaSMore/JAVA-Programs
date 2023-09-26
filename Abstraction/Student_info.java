package com.Abstraction;

public class Student_info extends Student
{
	float total ;
	float per;
	
	public Student_info(String name,int id,int std)
	{
		super(name,id,std);
	}
	
	public float total_marks(float eng,float hindi,float maths,float mar)
	{
		total = eng + hindi + maths + mar;
		return total;
	}
	
	public float percentage()
	{
		per = total/4;
		return per;
	}

}
