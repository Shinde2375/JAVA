package com.tka.hw.prog9;

public class MultiThreadDemo2 implements Runnable {

	public static void main(String[] args) {
		Thread t1 = new Thread("JavaKiran");
		Thread t2 = new Thread("Java");
		t1.start();
		t2.start();
		System.out.println("Thread name are following:");
		System.out.println(t1.getName());
		System.out.println(t2.getName());
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
	}
}