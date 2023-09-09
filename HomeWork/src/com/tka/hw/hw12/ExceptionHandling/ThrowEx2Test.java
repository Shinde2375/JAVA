package com.tka.hw.hw12.ExceptionHandling;

public class ThrowEx2Test {

	public static void main(String[] args) {
		try {
			ThrowEx2 i = new ThrowEx2();
			i.myMethod(1);
		}
		catch (Exception e) {
			System.out.println(e);		}
	}
}