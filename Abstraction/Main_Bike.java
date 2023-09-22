package com.Abstraction;

public class Main_Bike 
{
	public static void main(String[] args) 
	{
		Fz obj = new Fz("FZ","Yamaha");
		obj.display();
		
		int a = obj.milage(13);
		System.out.println("Milage : "+a);
		
		int b = obj.noOfGear(4);
		System.out.println("No of Gears : "+b);
		
		
		
	}

}
