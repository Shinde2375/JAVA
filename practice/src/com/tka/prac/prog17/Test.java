package com.tka.prac.prog17;

import java.util.Scanner;

public class Test {
public static void main(String[] args) throws ArithmeticException {
	System.out.println("Enter two numbers");
	Scanner sc = new Scanner(System.in);
	int a =sc.nextInt();
	int b =sc.nextInt();
	
	System.out.println(a/b);
	throw new ArithmeticException("ArithmeticException occures");
//	try {
//	System.out.println(a/b);
//	}
//	catch(ArithmeticException e )
//	{
//		System.out.println("Number not be null");
//	}
}
}
