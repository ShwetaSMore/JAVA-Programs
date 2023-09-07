package com.inheritance;

public class dog extends animal
{
	int id;
	String breed;
	
	public dog(String name,String species,int id,String breed)
	{
		super(name,species);
		this.id = id;
		this.breed = breed;
		
	}
	
	public void display()
	{
		System.out.println("Name : "+super.name);
		System.out.println("Species : "+super.species);
		System.out.println("Id : "+id);
		System.out.println("Breed : "+breed);
	}

}
