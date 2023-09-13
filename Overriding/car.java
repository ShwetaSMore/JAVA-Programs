package com.Overriding;

public class car extends vehicle
{
	String brand;
	String carno;
	
	car(String vehicle_type,String brand,String carno)
	{
		super(vehicle_type);
		this.brand = brand;
		this.carno = carno;
		
	}
	
	@Override
	public void display()
	{
		System.out.println("Vehicle type : "+vehicle_type);
		System.out.println("Vehicle brand : "+brand);
		System.out.println("Vehicle car No : "+ carno);
		
	}

	

}
