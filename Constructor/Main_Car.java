package com.Constructor;
import java.util.*;

public class Main_Car 
{
	public static void main(String[] args) 
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the Car name : ");
		String a = sobj.next();
		
		System.out.println("Enter the Car model : ");
		String b = sobj.next();
		
		System.out.println("Enter the year : ");
		int c = sobj.nextInt();
		
		Car cobj = new Car(a,b,c);
		cobj.display();
		
		
		
		
	}

}
