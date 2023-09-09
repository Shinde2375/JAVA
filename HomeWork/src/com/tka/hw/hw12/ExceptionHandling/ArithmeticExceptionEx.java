package com.tka.hw.hw12.ExceptionHandling;

public class ArithmeticExceptionEx {



	public static void main(String[] args){	
		try
		{
			int num1=10,num2 =0;
			int sum=0;
			
			sum = num1/num2;
			System.out.println(sum);
		}
		catch (ArithmeticException e) {
			System.out.println("Cant / divide by zero");

		}
	}

}
