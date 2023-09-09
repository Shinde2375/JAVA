package com.tka.day17.prog1;

public class Test3 {

	public static void main(String[] args) {
		int age = -67;
		try {
		if(age<0)
		{
//			InvalidAgeException e = new InvalidAgeException();    1st method
//			throw e;
			
			 throw new InvalidAgeException();    //2nd methodd
		}
		System.out.println("age is valid");
		}
		catch(InvalidAgeException e)
		{
			e.printStackTrace();
		}
	}
}