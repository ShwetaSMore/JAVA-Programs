package com.overloading;

public class Vehicle 
{
	String v_name;
	String v_no;
	String brand;
	
	public void display(String name)
	{
		this.v_name = name;
		System.out.println("Vehicle name : "+v_name);
		System.out.println();
	}
	
	public void display(String name, String v_no)
	{
		this.v_name = name;
		this.v_no = v_no;
		System.out.println("Vehicle name : "+v_name);
		System.out.println("Vehicle Number : "+this.v_no);
		System.out.println();
	}
	
	public void display(String name, String v_no, String brand)
	{
		this.v_name = name;
		this.v_no = v_no;
		this.brand = brand;
		System.out.println("Vehicle name : "+v_name);
		System.out.println("Vehicle Number : "+this.v_no);
		System.out.println("Vehicle Brand : "+this.brand);
		System.out.println();
	}
	

}
