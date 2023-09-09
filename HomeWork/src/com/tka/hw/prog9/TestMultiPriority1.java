package com.tka.hw.prog9;

public class TestMultiPriority1 extends Thread {

	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		TestMultiPriority1 t1 = new TestMultiPriority1();
		TestMultiPriority1 t2 = new TestMultiPriority1();
		
		
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t1.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		t2.start();
	}
}