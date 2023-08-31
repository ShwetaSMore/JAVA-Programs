package com.Encapsulation;

public class Main_Bank 
{
	public static void main(String[] args) 
	{
		Bank bobj = new Bank();
		
		bobj.setAccNo(12345);
		System.out.println("Account Number : "+bobj.getAccNo());
		
		bobj.setBal(45625.55);
		System.out.println("Balance : "+bobj.getBal());
		
		bobj.withdraw(2536.45);
		
		bobj.deposite(3000);
		
	}

}
