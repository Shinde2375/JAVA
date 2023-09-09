package com.tka.day16.prog1;												//day: thursday
																			//date: 24/8/23

public class Test {

	public static void main(String[] args) {
		try {
		Class.forName("com.tka.day16.prog1.X");
		Class.forName("com.tka.day16.prog1.Y");
//		Class.forName("com.tka.day16.prog1.Z");
		
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}