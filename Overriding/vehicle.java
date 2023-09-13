package com.Overriding;

public class vehicle 
{
	String vehicle_type;
	
	vehicle(String vehicle_type)
	{
		this.vehicle_type = vehicle_type;
	}
	
	public void display()
	{
		System.out.println("Vehicle type : "+vehicle_type);
		
	}

}
