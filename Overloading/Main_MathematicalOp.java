package com.overloading;

public class Main_MathematicalOp 
{
	public static void main(String[] args) 
	{
		MatematicalOP obj = new MatematicalOP();
		
		int a = obj.operation(10, 20);
		System.out.println(a);
		
		float b = obj.operation(2.5f, 55.3f);
		System.out.println(b);
		
		int c = obj.operation(12, 7);
		System.out.println(c);
		
		obj.operation("Shweta"," More");
		
	}

}
