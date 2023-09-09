package com.tka.hw.prog9;

public class MultiThreadDemo1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is running...");
	}
	public static void main(String[] args) {
		MultiThreadDemo1 m1 = new MultiThreadDemo1();
		Thread t1 = new Thread(m1);
		t1.start();
	}
}