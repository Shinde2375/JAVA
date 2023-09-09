package com.tka.day19.prog6;

public class Job extends Thread {

	public void run()
	{
		for(int i=0;i<=10;++i)
		{
			if(i>0 &&i%2 ==0)
			System.out.println(i);
		}
		
		try {
			Thread.currentThread().sleep(100);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}	
	}
}
