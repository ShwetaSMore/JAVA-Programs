package com.Methods;
import java.util.*;

public class Vehicle 
{
	Scanner sobj = new Scanner(System.in);
	
	public void display()
	{
		System.out.println("Give the vehicle name: ");
		String vName = sobj.next();
		System.out.println("Give the vehicle type : ");
		String vtype = sobj.next();
		System.out.println("Give the vehicle number : ");
		int vNo = sobj.nextInt();
		System.out.println("Give the vehicle color : ");
		String vColor = sobj.next();
		
		System.out.println();
		
		System.out.println("Vehicle name: "+vName);
		System.out.println("Vehicle type : "+vtype);
		System.out.println("Vehicle number : "+vNo);
		System.out.println("Vehicle color : "+vColor);
		
	}

}
