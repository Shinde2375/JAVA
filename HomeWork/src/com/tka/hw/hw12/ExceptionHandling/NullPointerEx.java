package com.tka.hw.hw12.ExceptionHandling;

public class NullPointerEx {
	public static void main(String[] args) {
		try {
			String s = null;
//			System.out.println(s);
			System.out.println(s.length());
		}
		catch (NullPointerException e) {
			System.out.println("Null point Exception Occured");
		}
	}
}