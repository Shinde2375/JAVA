package com.tka.hw.prog9;
 class MultiThreadDemo extends Thread{
	 public void run()
	 {
	try {
		System.out.println("Thread "+Thread.currentThread().getId()+" "
				+ "Is Running");	
	}catch(Exception e)
	{
		e.printStackTrace();
		System.out.println("Exception is caught");
	}	
}
}
public class MultiThread {

	public static void main(String[] args) {
		
		int n=8;
		for(int i=0;i<n;i++)
		{
		MultiThreadDemo m1 = new MultiThreadDemo();
		m1.start();
		}
	}
}