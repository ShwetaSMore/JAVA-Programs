package com.Abstraction;

public abstract class Mail 
{
	String sendmail;
	String subject;
	String body;
	
	public Mail(String sendmail,String subject,String body)
	{
		this.sendmail = sendmail;
		this.subject = subject;
		this.body = body;
	}
	
	public abstract boolean authenticationOfMail();
	
	public abstract String connecting();
	
	public abstract void sendmail();
	
	public abstract String disconnecting();
	
	

}
