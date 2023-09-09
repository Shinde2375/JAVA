package com.tka.day19.prog7;

public class Test {

	public static void main(String[] args) {

		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);

		Job e = new Job();
		Thread t1 = new Thread(e);
		Thread t2 = new Thread(e);
		Thread t3 = new Thread(e);
		t2.setPriority(1);
		t1.setPriority(1);
		t3.setPriority(10);

		t1.setName("t1");
		t2.setName("t2");
		t3.setName("t3");

		t1.start();
		t2.start();
		t3.start();

		//		t1.run();
		//		t2.run();					//it can print thread one by one;
		//		t3.run();
		//		t1.run();
		//		t1.run();
		//		t1.run();
		
		try {
	t1.join();
	t2.join();
	t3.join();
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}
	System.out.println("Exit From Main");
	
		}
	}
