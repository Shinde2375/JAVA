package com.tka.hw.hw12.ExceptionHandling;

public class ThrowEx3 {

	static void criteria(int stuage,int stuweight)
	{
		if(stuage<12 && stuweight < 40)
		{
			throw new ArithmeticException(" stud are not eligible...");
		}
		else
		{
			System.out.println("stud aree fit...");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome ...");
		criteria(13,39);
		System.out.println("continue...");
	}
}