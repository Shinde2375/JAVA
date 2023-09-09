package com.tka.hw.hw11.FinalStatic;

public class DemoBlankVariable {

	final int MaxValue;
	
	public DemoBlankVariable()
	{
		MaxValue = 100;
	}
	
	void myMethod()
	{
		System.out.println(MaxValue);
	}
	
	public static void main(String[] args) {
		DemoBlankVariable d1 = new DemoBlankVariable();
		d1.myMethod();
	}
}