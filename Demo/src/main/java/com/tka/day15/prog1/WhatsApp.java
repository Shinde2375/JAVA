package com.tka.day15.prog1;

 class Chattingapp {

	public void sentmessage()
	{
		System.out.println("Message is sent");
	}
}

class WhatsApp extends Chattingapp
{
	public void sentmessage()
	{
		System.out.println("Message updated and sent..");
	}
}
