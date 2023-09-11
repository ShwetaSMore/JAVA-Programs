package com.Overriding;

public class animal 
{
	String name;
	String species;
	
	public animal(String name,String species)
	{
		this.name = name;
		this.species = species;
	}
	
	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Species : "+species);
	}

}
