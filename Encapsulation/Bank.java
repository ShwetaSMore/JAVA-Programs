package com.Encapsulation;

public class Bank 
{
	
	private int accountnumber;
	private double balance;
	
	public void setAccNo(int AccN)
	{
		this.accountnumber = AccN;
	}
	
	public int getAccNo()
	{
		return accountnumber;
	}
	
	public void setBal(double Bal)
	{
		this.balance = Bal;
	}
	
	public double getBal()
	{
		return balance;
	}
	
	public void withdraw(double amount)
	{
		if(amount <= balance)
		{
			balance = balance - amount;
			System.out.println("Balance after withdrawing : "+balance);
		}
		else
		{
			System.out.println("Amount is greater than balance.");
		}
	}
	
	public void  deposite(double amount)
	{
		balance = balance + amount;
		System.out.println("balance after depositing : "+balance);
	}
	
}
