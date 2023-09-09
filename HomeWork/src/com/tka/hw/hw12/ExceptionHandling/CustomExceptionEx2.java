package com.tka.hw.hw12.ExceptionHandling;
public class CustomExceptionEx2 {

	public static void main(String[] args) {
		try
		{
			throw new CustomExceptionEx1("Customer");
		}
		catch (CustomExceptionEx1 e) {
			System.out.println("This is Catch block");
			System.out.println(e);
			
//			e.printStackTrace();
		}
	}
}