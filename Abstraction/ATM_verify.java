package com.Abstraction;

public class ATM_verify extends ATM
{
	public ATM_verify(String accName,long accNo,String bank_branch,double balance)
	{
		super(accName,accNo,bank_branch,balance);
	}
	
	@Override
    public double deposite(float amount)
    {
    	super.balance = super.balance + amount;
    	return super.balance;
    }
	
	@Override
	public double withdraw(float amount)
	{
		super.balance = super.balance - amount;
		return super.balance;
	}

}
