package com.ScannerClass;
import java.util.*;

public class Operation 
{
	public void SwitchCase()
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("");
		
		System.out.println("Enter the choice: ");
		System.out.println("");
		System.out.println("For Addition enter  choice == 1");
		System.out.println("For Subtraction enter  choice == 2");
		System.out.println("For Multiplication enter  choice == 3");
		System.out.println("For Division enter  choice == 4");
		
		int choice = sobj.nextInt();
		
		switch(choice)
		{
		case 1:
			
			System.out.println("For addition enter two numbers: ");
			float num1 = sobj.nextFloat();
			Float num2 = sobj.nextFloat();
			float add = num1+num2;
			System.out.println("Addition is : "+add);
			break;
		
		case 2: 
			System.out.println("For subtraction enter two numbers: ");
			float num3 = sobj.nextFloat();
			Float num4 = sobj.nextFloat();
			float sub = num3-num4;
			System.out.println("Subtraction is : "+sub);
			break;
			
		case 3:
			System.out.println("For Multiplication enter two numbers: ");
			float num5 = sobj.nextFloat();
			Float num6 = sobj.nextFloat();
			float mul = num5*num6;
			System.out.println("Multiplication is : "+mul);
			break;
			
		case 4 :
			System.out.println("For Division enter two numbers: ");
			float num7 = sobj.nextFloat();
			Float num8 = sobj.nextFloat();
			float div = num7/num8;
			System.out.println("Division is : "+div);
			break;
			
		default :
			System.out.println("Enter valid choice.");
		
		}
	}
	
	

}
