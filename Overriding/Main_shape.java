package com.Overriding;

public class Main_shape 
{
	public static void main(String[] args) 
	{
		Rectangle obj = new Rectangle("Rectangle",10,20);
		double iret = obj.area();
		System.out.println("Area : "+iret);
		
		double iret1 = obj.circumference();
		System.out.println("Circumference: "+iret1);
		System.out.println();
		
		Square obj1 = new Square("Square",2.5f);
		double isq = obj1.area();
		System.out.println("Area : "+isq);
		
		double isq1 = obj1.circumference();
		System.out.println("Circumference : "+isq1);
		System.out.println();
		
		Triangle obj2 = new Triangle("Triangle",3.1f,2,3,4,4);
		double itri = obj2.area();
		System.out.println("Area : "+itri);
		
		double itri1 = obj2.circumference();
		System.out.println("Circumference : "+itri1);
		System.out.println();
		
		Circle obj3 = new Circle("Circle",5.5f);
		double icir = obj3.area();
		System.out.println("Area : "+icir);
		
		double icir1 = obj3.circumference();
		System.out.println("Circumference : "+icir1);
		
	}

}
