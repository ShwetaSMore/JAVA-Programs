package com.inheritance;

public class car extends vehical
{
	String carNo;
	String Brand;
	
	public car(String t,String carNo,String Brand)
	{
		super(t);
		this.Brand = Brand;
		this.carNo = carNo;
	}
	
	void display()
	{
		System.out.println("Type : "+super.type);
		System.out.println("Brand : "+Brand);
		System.out.println("Car Number : "+carNo);
	}
	

}
