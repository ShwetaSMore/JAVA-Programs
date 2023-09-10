package com.Constructor;

public class Car 
{
	String carname;
	String model;
	int year;
	
	public Car(String a,String b, int c)
	{
		carname = a;
		model = b;
		year = c;
		
	}
	
	public void display()
	{
		System.out.println();
		System.out.println("Car Name = "+carname);
		System.out.println("Car model = "+model);
		System.out.println("Year = "+year);
	}

}
