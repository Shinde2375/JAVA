package com.tka.hw.hw12.ExceptionHandling;

public class CustomExceptionEx1 extends Exception {
	String str1;

	CustomExceptionEx1(String str2)
	{
		str1 = str2;
	}
	
	public  String toString()
	{
		return ("Output is :"+str1);
		
	}
}
