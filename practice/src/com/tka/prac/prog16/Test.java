package com.tka.prac.prog16;

public class Test {

	public static void main(String[] args) {
		
		int x = 153;
		int r = x;
		int temp = x;
		int sum=0;
		
		while(x>0)
		{
			r = x%10;
			sum = sum+(r*r*r);
			x = x/10;
			
		}
		if(temp == sum)
		{
			System.out.println("this is an armstrong no.");
		}
		else
		{
			System.out.println("Not an armstrong no.");
		}
	}
}