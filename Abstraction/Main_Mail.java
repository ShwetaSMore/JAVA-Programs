package com.Abstraction;

public class Main_Mail 
{
	public static void main(String[] args) 
	{
		Email obj = new Email("shwetamore7769@gmail.com","About one day leave","Hello mam,\n            due to illness,I'm not able to attend the lecture today.\n            Please grant me the permission for the same.\n            Thankyou!");
		
		obj.sendmail();
	}

}
