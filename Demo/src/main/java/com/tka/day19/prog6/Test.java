package com.tka.day19.prog6;

public class Test {

	public static void main(String[] args) {
		Job j1 = new Job();
		
		Thread t1 = new Thread(j1);
		Thread t2 = new Thread(j1);
		Thread t3 = new Thread(j1);
		t1.start();
		t2.start();
		t3.start();
				
	}
}
