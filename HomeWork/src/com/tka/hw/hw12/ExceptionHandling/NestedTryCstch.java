package com.tka.hw.hw12.ExceptionHandling;

public class NestedTryCstch {

	public static void main(String[] args) {
		try
		{
			try {
				System.out.println("Inside block");
				int b = 45/0;
				System.out.println(b);			
			}
			catch (ArithmeticException e1) {
System.out.println("Exception : divide by zero");	
}
			try {
				System.out.println("Inside block2");
				int c = 30/0;
				System.out.println(c);
			}
			catch (ArrayIndexOutOfBoundsException e2) {
	System.out.println("Exception e2");		
	}
		System.out.println("Just other Statement");
		
		}
		catch (ArithmeticException e3) {
System.out.println("arithmatic exception");
System.out.println("Inside parent try catch block");
}
		catch (ArrayIndexOutOfBoundsException e4) {
System.out.println("ArrayIndexOutOfBond");		
}
		catch (Exception e) {
System.out.println("Some other exception");		
}
		
		System.out.println("Out of try catch block :");
		
		
	}
	
	

}
