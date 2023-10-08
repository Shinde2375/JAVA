package com.tka.day17.prog1;
public class A {
	void m1() throws ClassNotFoundException
	{
		Class.forName("com.tka.day16.prog1.C");			//2nd progg..	
		System.out.println("m1");			//...1st progg
	}
}