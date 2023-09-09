package com.tka.day19.prog7;

public class Job2 implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=100;++i)
		{
			if(i%5==0)
				System.out.println(i+" "+
						Thread
						.currentThread()
				.getState());
		}
	}
}