package com.tka.day22.prog1;

public interface X {
	public static final int p =10;
	
	public abstract void m1();
	
	public static void m2()
	{
		System.out.println("this is static methodd");
	}
	default void m3()
	{
		System.out.println("This is Default Methodd");
	}
}