package com.Abstraction;

public class Emp_info extends Employee
{
	float TA,HRA,DA,PT,PF;
	float Gross_salary;
	float Net_salary;
	
	public Emp_info(String name,int eid,float salary,float experience)
	{
		super(name,eid,salary,experience);
	}
	
	@Override
	public void getTA()
	{
		TA = (super.salary*15)/100;
	}
	
	@Override
	public void getHRA()
	{
		HRA = (super.salary*20)/100;
	}
	
	@Override
	public void getDA()
	{
		DA = (super.salary*10)/100;
	}
	
	@Override
	public void getPF()
	{
		PF = (super.salary*15)/100;
	}
	
	@Override
	public void getPT()
	{
		PT = (super.salary*10)/100;
	}
	
	@Override
    public float getgross_salary()
    {
    	Gross_salary = salary+DA+HRA+TA;
    	return Gross_salary;
    }
	
	@Override
	public float getnet_salary()
	{
		Net_salary = Gross_salary -(PF+PT);
		return Net_salary;
	}

}
