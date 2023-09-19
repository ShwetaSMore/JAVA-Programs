package com.Abstraction;

public class Bear extends Animal
{
	public Bear(String name,String breed,String location,String foodtype)
	{
		super(name,breed,location,foodtype);
	}
	
	@Override
	public String makesound(String sound)
	{
		String sou = sound;
		return sou;
	}
	
	@Override
	public String eat(String eat)
	{
		String et = eat;
		return et;
	}

}
