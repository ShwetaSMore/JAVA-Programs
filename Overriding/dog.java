package com.Overriding;

public class dog extends animal
{
	int id;
	String breed;
	
	dog(String name,String species,int id,String breed)
	{
		super(name,species);
		this.id = id;
		this.breed = breed;
	}
	
	@Override
	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Species : "+species);
		System.out.println("Id : "+id);
		System.out.println("Breed : "+breed);
	}

}
