package com.tka.hw.prog9;
public class JoinThreadDemo extends Thread{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			try {
				Thread.sleep(500);
			}catch (Exception e) {
System.out.println(e);			
}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		JoinThreadDemo t1 = new JoinThreadDemo();
		JoinThreadDemo t2 = new JoinThreadDemo();
		JoinThreadDemo t3 = new JoinThreadDemo();
		t1.start();
		try
		{
			t1.join();
		}
		catch (Exception e) {
System.out.println("Exception caught.."+e);	
}
		t2.start();
		t3.start();
	}
}