package com.tka.prac.prog6;

public class Test {
	
	public void  show()

	{
		int sum =0;
		for(int i=1;i<=10;i++)
		{
			sum = sum+i;
			
		}

		System.out.println("Total is"+sum);
	}
	public static void main(String[] args) {
		
		{
			Test t = new Test();
			t.show();
		}
	}
}
