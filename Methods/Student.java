package com.Methods;

public class Student 
{
	public void percentage(String name,float eng,float mar,float hindi,float sci,float maths)
	{
		float total = eng+mar+hindi+sci+maths;
		float per = total/5;
		
		System.out.println("Percentage of "+name+" is : "+per+"%");
	}

}
