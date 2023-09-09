package com.tka.day19.prog6;

public class Test2 {

	public static void main(String[] args) {
		
		Job2 j = new Job2();
		
		Thread t1 = new Thread(j);
		Thread t2 = new Thread(j);
		Thread t3 = new Thread(j);
		
		Job2 j2 = new Job2();
		
		Thread t4 = new Thread(j);
		Thread t5 = new Thread(j);
		
		Job2 j3 = new Job2();
		
		Thread t6 = new Thread(j);
		Thread t7 = new Thread(j);


		
		
		t1.setName("t1:");
		t2.setName("t2:");
		t3.setName("t3:");
		t4.setName("t4:");
		t5.setName("t5:");
		t6.setName("t6:");
		t7.setName("t7:");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		
		try {
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		t5.join();
		t6.join();
		t7.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("=====Exit From Main =====");
	}
		}

