package com.Overriding;

public class Animal_1 
{
	String name;
	String type;
	
	Animal_1(String name,String type)
	{
		this.name= name;
		this.type = type;
		System.out.println("Name            : "+name);
		System.out.println("Type            : "+type);
	}
	
	public int myLifePeriod(int year)
	{
		return year;
	}
	
	public String myFoodType(String foodtype)
	{
		return foodtype;
	}
	
	public String mySound(String sound)
	{
		return sound;
	}
	
	public String myGeoLoaction(String geoL)
	{
		return geoL;
	}
	
	public String myFavFood(String favFood)
	{
		return favFood;
	}
	

}
