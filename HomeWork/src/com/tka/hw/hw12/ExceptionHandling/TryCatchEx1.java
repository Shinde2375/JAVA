package com.tka.hw.hw12.ExceptionHandling;

public class TryCatchEx1 {

	public static void main(String[] args) {
		int num1,num2;
		try {
			num1 = 0;
			num2 = 62/num1;
			System.out.println(num2);
		}
		catch (ArithmeticException e) {
			System.out.println("Dont divide no by zero"+e);
		}
		System.out.println("Iam Out of try-catch Block");
	}
}