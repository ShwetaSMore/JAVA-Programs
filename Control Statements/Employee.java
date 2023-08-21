package com.ControlStatements;

public class Employee 
{
	public static void main(String[] args) 
	{
		int salary = 50000;
		int da = (salary*10)/100;
		int hra = (salary*20)/100;
		int pf = (salary*15)/100;
		int pt = (salary*10)/100;
		int ta = (salary*15)/100;
		
		int Gross_salary = salary+da+hra+ta;
		System.out.println("Gross salary is : "+Gross_salary);
		
		int Net_salary = Gross_salary -(pf+pt);
		System.out.println("Net salary is : "+Net_salary);
		
	}

}
