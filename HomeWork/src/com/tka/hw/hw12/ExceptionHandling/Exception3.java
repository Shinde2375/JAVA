package com.tka.hw.hw12.ExceptionHandling;

public class Exception3 {

	static int sum(int num1,int num2)
	{
	if(num1==0)
		throw new ArithmeticException("first vale is not correct");
	else
		System.out.println("good");
	return num1+num2;
	
	}
	public static void main(String[] args) {
int res = sum(0,12);
		System.out.println(res);
		System.out.println("continuee...");
	}
}