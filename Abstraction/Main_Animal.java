package com.Abstraction;

public class Main_Animal 
{
	public static void main(String[] args) 
	{
		Bear obj1 = new Bear("Bear","Polar_Bear","Greeen_land","Non_veg");
		obj1.display();
		System.out.println("Sound : "+obj1.makesound("grawl"));
		System.out.println("Eat : "+obj1.eat("Fish"));
		System.out.println();
		
		Fox obj2 = new Fox("Fox","Artic_fox","Artic_Region","Non_veg");
		obj2.display();
		System.out.println("Sound : "+obj2.makesound("yowl"));
		System.out.println("Eat : "+obj2.eat("Fish,Squirels"));
		System.out.println();
		
		Lion obj3 = new Lion("Lion","White_lion","Wild_forest","Non_veg");
		obj3.display();
		System.out.println("Sound : "+obj3.makesound("Roar"));
		System.out.println("Eat : "+obj3.eat("deer"));
		System.out.println();
	}

}
