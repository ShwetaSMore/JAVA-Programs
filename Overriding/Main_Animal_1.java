package com.Overriding;
import java.util.*;

public class Main_Animal_1 
{
	
	Scanner sobj = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		Wild obj = new Wild("Tiger","Wild");
		
		
		int iret = obj.myLifePeriod(65);
		System.out.println("Life Period     : "+iret);
		
		String iret1 = obj.myFavFood("deer");
		System.out.println("Favourite food  : "+iret1);
		
		String iret2 = obj.mySound("roar");
		System.out.println("Sound           : "+iret2);
		
		String iret3 = obj.myGeoLoaction("Forest");
		System.out.println("My Geo Location : "+iret3);
		
		String iret4 = obj.myFoodType("carnivore");
		System.out.println("Food Type       : "+iret4);
		System.out.println();
		
		Domestic obj1 = new Domestic("Dog","Domestic");
		
		int ido = obj1.myLifePeriod(30);
        System.out.println("Life Period     : "+ido);
		
		String ido1 = obj.myFavFood("Meat");
		System.out.println("Favourite food  : "+ido1);
		
		String ido2 = obj.mySound("bark");
		System.out.println("Sound           : "+ido2);
		
		String ido3 = obj.myGeoLoaction("Home");
		System.out.println("My Geo Location : "+ido3);
		
		String ido4 = obj.myFoodType("Veg_&_Nonveg");
		System.out.println("Food Type       : "+ido4);
		System.out.println();
		
		Wild_Veg wobj = new Wild_Veg("Elephant","Wild-Veg");
		
		int iw = wobj.myLifePeriod(65);
		System.out.println("Life Period     : "+iw);
		
		String iw1 = wobj.myFavFood("Leafy_Trees");
		System.out.println("Favourite food  : "+iw1);
		
		String iw2 = wobj.mySound("trumpets");
		System.out.println("Sound           : "+iw2);
		
		String iw3 = wobj.myGeoLoaction("Forest");
		System.out.println("My Geo Location : "+iw3);
		
		String iw4 = wobj.myFoodType("veg");
		System.out.println("Food Type       : "+iw4);
		System.out.println();
		
        Wild_Non_Veg wnv = new Wild_Non_Veg("Lion","Wild_Non_Veg");
		
		int iwn = wnv.myLifePeriod(60);
		System.out.println("Life Period     : "+iwn);
		
		String iwn1 = wnv.myFavFood("Meat");
		System.out.println("Favourite food  : "+iwn1);
		
		String iwn2 = wnv.mySound("Roars");
		System.out.println("Sound           : "+iwn2);
		
		String iwn3 = wnv.myGeoLoaction("Wild_Forest");
		System.out.println("My Geo Location : "+iwn3);
		
		String iwn4 = wnv.myFoodType("Carnivore");
		System.out.println("Food Type       : "+iwn4);
		System.out.println();
		
        Bird bobj = new Bird("Parrot","Bird");
		
		int b = bobj.myLifePeriod(30);
        System.out.println("Life Period     : "+b);
		
		String b1 = bobj.myFavFood("Grains");
		System.out.println("Favourite food  : "+b1);
		
		String b2 = bobj.mySound("whistles");
		System.out.println("Sound           : "+b2);
		
		String b3 = bobj.myGeoLoaction("Trees");
		System.out.println("My Geo Location : "+b3);
		
		String b4 = bobj.myFoodType("Veg");
		System.out.println("Food Type       : "+b4);
		System.out.println();
	
		
	}
	

}
