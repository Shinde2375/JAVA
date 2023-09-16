package com.tka.day22.prog1;

public interface A1 {

	public static final int x=10;
	public abstract void m1();
	static void m2()
	{
		System.out.println("Static method");
	}
	
	default void m3()
	{
		System.out.println("Default Method");
	}
}