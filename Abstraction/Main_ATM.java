package com.Abstraction;

public class Main_ATM 
{
	public static void main(String[] args) 
	{
		ATM_verify obj = new ATM_verify("Shweta_More",625452777,"Indapur",1500.50);
		obj.display();
		double iret = obj.deposite(4500.5f);
		System.out.println("Balance after depositing : "+iret);
		
		double iret1 = obj.withdraw(800);
		System.out.println("Balance after withdrawal : "+iret1);
		
	}

}
