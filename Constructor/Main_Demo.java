package com.Constructor;
import java.util.*;

public class Main_Demo 
{
	public static void main(String[] args) 
	{
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter value for a : ");
		int a = sobj.nextInt();
		
		System.out.println("Enter value for b : ");
		float b = sobj.nextFloat();
		
		System.out.println("Enter value for c : ");
	    String c = sobj.next();
		
		Demo dobj = new Demo(a,b,c);
		dobj.display();
		
		System.out.println();
        Demo dobj1 = new Demo(28,23.4f,"Language");
		dobj1.display();
	}

}
