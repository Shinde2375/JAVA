package com.tka.day17.prog1;

public class B extends A {
	void m2()
	{
		A a = new A();
			try {
				a.m1();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		System.out.println("m2");
	}
}
