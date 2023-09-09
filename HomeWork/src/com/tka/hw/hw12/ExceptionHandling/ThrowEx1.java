package com.tka.hw.hw12.ExceptionHandling;

public class ThrowEx1 {

	static void throwMethod()throws NullPointerException {
		System.out.println("Inside throw Method");
		throw new NullPointerException();
	}
	public static void main(String[] args) {
try {
	throwMethod();
}
catch (NullPointerException e) {
System.out.println("Exception Caught"+ e);
}
	}
}