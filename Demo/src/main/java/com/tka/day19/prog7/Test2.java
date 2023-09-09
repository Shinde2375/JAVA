package com.tka.day19.prog7;

public class Test2 {

	public static void main(String[] args) {
		Job2 j = new Job2();
		Thread t1 = new Thread(j);
		System.out.println(t1.getState());
		t1.start();
		System.out.println(t1.getState());
		try {

			t1.join();
		}
		catch (InterruptedException e) {
			e.printStackTrace();
			
		}
		System.out.println(t1.getState());
	}
}
