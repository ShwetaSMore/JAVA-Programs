package com.Abstraction;

public abstract class Bike 
{
	String name;
	String brand;
	
	public Bike(String name,String brand)
	{
		this.name = name;
		this.brand = brand;
	}
	
	public abstract int noOfGear(int gear);
	
	public abstract int milage(int mil);

}
