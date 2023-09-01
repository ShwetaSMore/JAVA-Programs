package com.overloading;

public class Employee 
{
	
	public void display(int empID,String empN)
	{
		System.out.println();
		System.out.println("Employee ID : "+empID);
		System.out.println("Employee Name : "+empN);
	}
	
	public void display(int empID,String empN,long phoneN)
	{
		System.out.println();
		System.out.println("Employee ID : "+empID);
		System.out.println("Employee Name : "+empN);
		System.out.println("Employee Phone Number : "+phoneN);
	}
	
	public void display(int empID,String empN,long phoneN,String email)
	{
		System.out.println();
		System.out.println("Employee ID : "+empID);
		System.out.println("Employee Name : "+empN);
		System.out.println("Employee Phone Number : "+phoneN);
		System.out.println("Employee Email : "+email);
	}
	
	public void display(int empID,String empN,long phoneN,String email,float salary)
	{
		System.out.println();
		System.out.println("Employee ID : "+empID);
		System.out.println("Employee Name : "+empN);
		System.out.println("Employee Phone Number : "+phoneN);
		System.out.println("Employee Email : "+email);
		System.out.println("Emplyee Salary : "+salary);
	}

}
