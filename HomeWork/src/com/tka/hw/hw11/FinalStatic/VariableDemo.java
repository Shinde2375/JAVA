package com.tka.hw.hw11.FinalStatic;

public class VariableDemo {
	static int count =0;
	public void increment()
	{
		count++;
	}
	
	public static void main(String[] args) {
		VariableDemo v1 = new VariableDemo();
		VariableDemo v2 = new VariableDemo();
		v1.increment();
		v2.increment();
		System.out.println(v1.count);
		System.out.println(v2.count);
	}
}
