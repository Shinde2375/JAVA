package com.tka.hw.hw11.FinalStatic;

public class Student {

	int a;
	static int b;
	
	Student()
	{
		b++;
	}
	
	public void showData()
	{
		System.out.println("value of a :"+a);
		System.out.println("value of b :"+b);
	}
}