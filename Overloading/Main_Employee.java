package com.overloading;

public class Main_Employee 
{
	public static void main(String[] args) 
	{
		Employee obj = new Employee();
		
		obj.display(101,"Atharv");
		
		obj.display(102,"Omkar", 23515462);
		
		obj.display(103, "sahil", 21546542, "sahil@gmail.com");
		
		obj.display(104, "Era", 2154484, "era@gmail.com", 45265.5f);
		
	}

}
