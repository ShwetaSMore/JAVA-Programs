package com.inheritance;

public class Main_A_D 
{
	public static void main(String[] args) 
	{
		dog obj1 = new dog("Bruno","dog",001,"German Shepherd");
		obj1.display();
		System.out.println();
		
		dog obj2 = new dog("Lucy","dog",002,"Lab");
		obj2.display();
		
		System.out.println();
		dog obj3 = new dog("Candy","cat",003,"Percian");
		obj3.display();
		
	}

}
