package com.tka.day19.prog6;

public class Job2 implements Runnable {

	public void run()
	{
		for(int i=1;i<=10;++i)
		{
//			if( i%2==0)
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}