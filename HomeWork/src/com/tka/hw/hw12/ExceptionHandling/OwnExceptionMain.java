package com.tka.hw.hw12.ExceptionHandling;

public class OwnExceptionMain {

	public static void intfn() throws OwnException
	{
		System.out.println("This exception Throws by intfn()");
		throw new OwnException(11);
	}

	public static void floatfn() throws OwnException
	{
		System.out.println("this Exception throws by floatfn()");
		throw new OwnException((float)11.11);
	}
	public static void charfn() throws OwnException
	{
		System.out.println("this Exception throws by charfn()");
		throw new OwnException('A');
	}
	public static void Stringfn() throws OwnException
	{
		System.out.println("this Exception throws by String()");
		throw new OwnException("Java World");
	}

	public static void main(String[] args) {
		try {
			intfn();
		}catch(OwnException e)
		{
			e.printStackTrace();
		}

		try {
			floatfn();
		}catch (OwnException e) {
			e.printStackTrace();	
		}

		try {
			charfn();
		}catch (OwnException e) {
			e.printStackTrace();	
		}
		try {
			Stringfn();
		}catch (OwnException e) {
			e.printStackTrace();		
		}
	}
}
