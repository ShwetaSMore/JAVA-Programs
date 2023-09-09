package com.inheritance;

public class Main_Class 
{
	public static void main(String[] args) 
	{
		Child c1 = new Child();
		c1.Method1();
		c1.Method2();
		
		System.out.println();
		
		Parent p = new Child();  //Reference variable of parent class and object of child class
		p.Method1();
		
		System.out.println();
		
		Parent p1 = new Parent();
		p1.Method1();
		
	}

}
