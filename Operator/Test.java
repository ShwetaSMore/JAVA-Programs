package com.operator;

public class Test {
	// access modifier, keyword, return type , main method, data type, variable name
	public static void main(String[] args)
	{
		byte num1;  // variable declaration
		short num2 = 10; // variable initialization
		int num3 = 24;
		long num4 = 45;
		float num5 = 35.4f;
		double num6 = 73;
		char ch = 'a';
		
		
		//System.out.println(num2);
		//System.out.println(num3);
		System.out.println("Value of num2 -> " + num2);
		System.out.println("Value of num3 -> " + num3);
		System.out.println("Value of num4 -> " + num4);
		System.out.println("Value of num5 -> " + num5);
		System.out.println("Value of num6 -> " + num6);
		System.out.println("Value of character ch -> " + ch);
		
		System.out.println(Byte.SIZE/8);
		System.out.println(Short.SIZE/8);
		System.out.println(Integer.SIZE/8);
		System.out.println(Long.SIZE/8);
		System.out.println(Float.SIZE/8);
		System.out.println(Double.SIZE/8);
		System.out.println(Character.SIZE/8);
		
		
	}
	

}
