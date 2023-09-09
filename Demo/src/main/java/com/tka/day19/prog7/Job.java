package com.tka.day19.prog7;

public class Job  implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//		int count=0;
		for(int i=0;i<10;++i)
		{
			System.out.println(Thread.currentThread().getName()+": " +i+" " +" Hello");
			
			try {
				
				Thread.currentThread().sleep(1000);
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}}