package com.tka.day19.prog5;

public class Z extends Thread {
public void run()
{
	
	while(true)
	{
		System.out.println("Hello");
		try {
			Thread.currentThread().sleep(1000);
		}
		catch(InterruptedException e)
		{e.printStackTrace();
	}
	}
}
}
