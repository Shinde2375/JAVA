package com.tka.hw.hw11.FinalStatic;

public class StaticBlockEx {

	static int a;
	static int b;
	
	static {
		System.out.println("Static block called");
		a=10;
		b=20;
	}
	
	public static void main(String[] args) {
		System.out.println("value of a="+a);
		System.out.println("value of a="+b);
	}
}