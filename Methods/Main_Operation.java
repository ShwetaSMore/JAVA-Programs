package com.Methods;

public class Main_Operation 
{
	public static void main(String[] args) 
	{
		System.out.println("For object 1: ");
		Operation o1 = new Operation();
		
		float add = o1.Addition(19,23);
		System.out.println("Addition : "+add);
		
		float sub = o1.Subtraction(19,23);
		System.out.println("Subtraction : "+sub);
		
		float mul = o1.Multiplication(19,23);
		System.out.println("Multiplication : "+mul);
		
		float div = o1.Division(19,23);
		System.out.println("Division : "+div);
		
		
		System.out.println("\nFor object 2: ");
        Operation o2 = new Operation();
		
		float add2 = o2.Addition(24,4);
		System.out.println("Addition : "+add2);
		
		float sub2 = o2.Subtraction(24,4);
		System.out.println("Subtraction : "+sub2);
		
		float mul2 = o2.Multiplication(24,4);
		System.out.println("Multiplication : "+mul2);
		
		float div2 = o2.Division(24,4);
		System.out.println("Division : "+div2);
		
		
	}

}
