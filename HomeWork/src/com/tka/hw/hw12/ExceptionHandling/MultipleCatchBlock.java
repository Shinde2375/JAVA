package com.tka.hw.hw12.ExceptionHandling;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		try {
			int a[] = new int[7];
			a[4] = 30/0;
			System.out.println("first print statement in try block");
		}catch (ArithmeticException e) {
			System.out.println("Warning: Arithmatic exception");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Warning: Index out of bond");
		}catch (Exception e) {
			System.out.println("Warning : some other excepton");
		}
		System.out.println("out of try-catch block");
	}
}