package com.Overriding;

public class Bird extends Domestic
{
	Bird(String name,String type)
	{
		super(name,type);
		
	}
	
	@Override
	public int myLifePeriod(int year)
	{
		return year;
	}
	
	@Override
	public String myFoodType(String foodtype)
	{
		return foodtype;
	}
	
	@Override
	public String mySound(String sound)
	{
		return sound;
	}
	
	@Override
	public String myGeoLoaction(String geoL)
	{
		return geoL;
	}
	
	@Override
	public String myFavFood(String favFood)
	{
		return favFood;
	}

}
