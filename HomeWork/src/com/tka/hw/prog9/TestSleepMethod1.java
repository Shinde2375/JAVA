package com.tka.hw.prog9;

public class TestSleepMethod1 extends Thread{

	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			try {
				
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println(e);
			}
		System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		TestSleepMethod1 t1 = new TestSleepMethod1();
		TestSleepMethod1 t2 = new TestSleepMethod1();
		t1.start();
		t2.start();
		
	}
}
