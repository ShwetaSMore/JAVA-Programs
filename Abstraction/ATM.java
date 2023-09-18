package com.Abstraction;

public abstract class ATM 
{
	String accName;
	long accNo;
	String bank_branch;
	double balance;
	
	public ATM(String accName,long accNo,String bank_branch,double balance)
	{
		this.accName = accName;
		this.accNo = accNo;
		this.bank_branch = bank_branch;
		this.balance = balance;
	} 
	
	public abstract double deposite(float amount);
	
	public abstract double withdraw(float amount);
	
	public void display()
	{
		System.out.println("Account Name : "+accName);
		System.out.println("Account Number : "+accNo);
		System.out.println("Bank Branch : "+bank_branch);
		System.out.println("Initial balance : "+balance);
	}
	

}
