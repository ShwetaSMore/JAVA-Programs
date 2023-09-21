package com.Abstraction;

public class Fz extends Bike 
{
	public Fz(String name,String brand) 
	{
		super(name,brand);
	}
	
	@Override
	public int noOfGear(int gear)
	{
		return gear;
	}
	
	@Override
	public int milage(int mil)
	{
		return mil;
	}
	
	void display()
	{
		System.out.println("Name : "+super.name);
		System.out.println("Brand : "+super.brand);
	}

}
