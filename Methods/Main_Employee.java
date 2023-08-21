package com.Methods;

public class Main_Employee 
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		e1.calculate(50000);
		float Gsalary = e1.gross_salary();
		float Nsalary = e1.Net_salary(Gsalary);
		
		System.out.println("Gross salary is : "+ Gsalary);
		System.out.println("Net salary is : "+Nsalary);
	}

}
