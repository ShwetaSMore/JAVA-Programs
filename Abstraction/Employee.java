package com.Abstraction;

public abstract class Employee 
{
	String name;
	int eid;
	float salary;
	float experience;
	
	public Employee(String name,int eid,float salary,float experience)
	{
		this.name = name;
		this.eid = eid;
		this.salary = salary;
		this.experience = experience;
	}
	
	public abstract float getgross_salary();
	
	public abstract float getnet_salary();
	
	public abstract void getTA();
	
	public abstract void getHRA();
	
	public abstract void getDA();
	
	public abstract void getPF();
	
	public abstract void getPT();
	
	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("eid : "+eid);
		System.out.println("salary : "+salary);
		System.out.println("Experience : "+experience+" years");
	}

}
