package com.tka.day16.prog1;

public class Test2 {

	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		try {
		int ans = a/b;
		System.out.println(ans);
		System.out.println("TRY");
		}
		catch(ArithmeticException e)
		{
		e.printStackTrace();		
//		System.out.println("Can't divide by zero.");
		System.out.println("CATCH");
		
		}
		System.out.println("BYE");
	}
}
