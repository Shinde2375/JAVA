package com.tka.day19.prog5;

public class Y extends Thread{

	public void run()
	{
		for(int i=0;i<100;++i)
			if(i%2 !=0)
				System.out.println("Odd "+i);
	
	
	try {
		Thread.currentThread().sleep(100);
	}
	catch(InterruptedException e)
	{e.printStackTrace();
}
}
}
