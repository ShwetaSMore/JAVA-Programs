class AbstractDemo
{
	public static void main(String arg[])
	{
		//Demo obj = new Demo();	ERROR becoz we cannot create object of abstract class
		Demo obj;	//Reference	Allowed

		obj = new Hello();	//upcasting
		
		obj.fun();	//fun of Hello
		obj.gun();	//gun of Demo
		obj.sun();	//sun of Hello
		System.out.println(obj.i);	//10
		System.out.println(obj.j);	//20
	}
}

abstract class Demo 
{
	public int i,j;

	public Demo()	//Constructor
	{
		System.out.println("Inside constructor of Demo");
		i = 10;
		j = 20;
	}

	public void fun()
	{
		System.out.println("Inside fun of Demo");
	}
	public void gun()
	{
		System.out.println("Inside gun of Demo");
	}

	public abstract void sun();	  //virtual void sun() = 0;
}

class Hello extends Demo
{
	public int x,y;
	public Hello()
	{
		System.out.println("Inside constructor of Hello");
		x = 10;
		y = 20;
	}

	public void fun()	//Overriding
	{
		System.out.println("Inside fun of Hello");
	}

	public void sun()	//Defination
	{
		System.out.println("Inside sun of Hello");
	}
}