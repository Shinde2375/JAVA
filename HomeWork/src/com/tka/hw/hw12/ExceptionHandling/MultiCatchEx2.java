package com.tka.hw.hw12.ExceptionHandling;

public class MultiCatchEx2 {

	public static void main(String[] args) {
	int num1=11 , num2 =0;
	int sum=0;
	
	try {
		sum = num1/num2;
		System.out.println(sum);
	}
	 catch (ArithmeticException e) {
		System.out.println("Exception 1"+e);
		
	}
	catch (IndexOutOfBoundsException e) {
		// TODO: handle exception
		System.out.println("Exception 2"+e);
	}
	catch (Exception e) {
		// TODO: handle exception
		System.out.println("Exception 3"+e);
	}
	}
}
