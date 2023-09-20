package com.Abstraction;

public class Email extends Mail
{
	public Email(String sendmail,String subject,String body)
	{
		super(sendmail, subject,body);
	}
	
	@Override
    public boolean authenticationOfMail()
    {
    	if(sendmail!=null)
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    }
	
	@Override
	public String connecting()
	{
		String msg = "Message is sending...";
		return msg;
	}
	
	@Override
	public void sendmail()
	{
		String msgC = this.connecting();
		System.out.println(msgC);
		System.out.println();
		boolean msg = authenticationOfMail();
		if(msg==true)
		{
			System.out.println("To        : "+super.sendmail);
			System.out.println();
			System.out.println("Subject   : "+super.subject);
			System.out.println("Mail Body : "+super.body);
		}
		System.out.println();
		String msgD = this.disconnecting();
		System.out.println(msgD);
	}
	
	@Override
	public String disconnecting()
	{
		String msg = "Message is sent successfully!";
		return msg;
	}

}
