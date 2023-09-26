package com.Array;
import java.util.*;

public class Main_Print_Elements 
{
	public static void main(String[] args) 
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter size of array: ");
		int iret = sobj.nextInt();
		
		Print_Elements obj = new Print_Elements(iret);
		
		obj.PrintE();
	}

}
