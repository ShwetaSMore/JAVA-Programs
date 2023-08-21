package com.Methods;

public class Employee 
{
	float DA;
	float HRA;
	float TA;
	float PT;
	float PF;
	float salary;
	
	public void calculate(float salary)
	{
		DA = (salary*10)/100;
		HRA = (salary*15)/100;
	    TA = (salary*20)/100;
		PT = (salary*15)/100;
		PF = (salary*10)/100;	
	}
	
	public float gross_salary()
	{
		float Gross_salary = salary + DA + HRA + TA;
		return Gross_salary;
	}
	
	public float Net_salary(float Gsalary)
	{
		float net_salary = Gsalary - (PF+PT);
		return net_salary;
	}


}
