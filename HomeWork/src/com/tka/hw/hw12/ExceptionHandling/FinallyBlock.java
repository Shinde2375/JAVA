package com.tka.hw.hw12.ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		try {
			System.out.println("The Value :");
			for(int i=0;i<=3;i++)
			{
				System.out.println(i);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Finally block is printed....");
		}
	}
}