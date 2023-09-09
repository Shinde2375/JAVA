package com.tka.hw.hw12.ExceptionHandling;

class MyOwnExceptionEmployeeTest 
{
	static void employeeAge(int age) throws MyOwnException
	{
		if(age<0)
			System.out.println("age cant be less than zero");
		else
			System.out.println("Valid input");
	}
	public static void main(String[] args) {
		try {
			employeeAge(-2);
		}catch (MyOwnException e) {
			e.printStackTrace();
		}
	}
}