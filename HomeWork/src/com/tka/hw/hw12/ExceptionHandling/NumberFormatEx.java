package com.tka.hw.hw12.ExceptionHandling;

public class NumberFormatEx {

	public static void main(String[] args) {
		try {
			int num = Integer.parseInt("VIS");
			System.out.println(num);
		} catch (NumberFormatException e) {
			System.out.println("Number format Exception Occured");			}
	}
}