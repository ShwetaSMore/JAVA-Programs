package com.Abstraction;

public class Lion extends Animal 
{
	public Lion(String name,String breed,String location,String foodtype)
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
