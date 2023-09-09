package com.tka.hw.hw12.ExceptionHandling;

public class CustomExceptionEx3 {

	public static void main(String[] args) throws CustomExceptionEx1 {
		CustomExceptionEx3 ce  = new CustomExceptionEx3();
		ce.displayMessage();
	}

	public  void displayMessage() throws CustomExceptionEx1 {
		 for(int i=8;i>=0;i--)
		 {
			 System.out.println("i = "+i);
		 if(i==7) {
			 throw new CustomExceptionEx1("This is my own custom Message");
		 }
	}
	}
}