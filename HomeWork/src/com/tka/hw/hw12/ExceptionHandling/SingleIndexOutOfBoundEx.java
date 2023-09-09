package com.tka.hw.hw12.ExceptionHandling;

public class SingleIndexOutOfBoundEx {

	public static void main(String[] args) {
		try {
			String s = "asdfadfsdf";
			System.out.println(s);
			char c = s.charAt(0);
			c = s.charAt(40);
			System.out.println(c);

		}catch (StringIndexOutOfBoundsException e) {
			System.out.println("index out of bond Exception");		}
	}
}