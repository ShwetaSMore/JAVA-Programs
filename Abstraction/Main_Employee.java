package com.Abstraction;

public class Main_Employee 
{
	public static void main(String[] args) 
	{
		Emp_info obj = new Emp_info("Shweta",101,50000.45f,2);
		
		obj.getTA();
		obj.getHRA();
		obj.getDA();
		obj.getPF();
		obj.getPT();
		
		obj.display();
		
		float iret1 = obj.getgross_salary();
		System.out.println("Gross salary : "+iret1);
		
		float iret2 = obj.getnet_salary();
		System.out.println("Net salary : "+iret2);
	}

}
