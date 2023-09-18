package com.Abstraction;

public abstract class Animal 
{
	String name;
	String breed;
	String location;
	String foodtype;
	
	public Animal(String name,String breed,String location,String foodtype)
	{
		this.name = name;
		this.breed = breed;
		this.location = location;
		this.foodtype = foodtype;
	}
	
	public abstract String makesound(String sound);
	
	public abstract String eat(String eat);
	
	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Breed : "+breed);
		System.out.println("Location : "+location);
		System.out.println("Food Type : "+foodtype);
	}

}
