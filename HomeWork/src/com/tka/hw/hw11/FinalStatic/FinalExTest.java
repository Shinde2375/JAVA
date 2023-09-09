package com.tka.hw.hw11.FinalStatic;

class FinalEx1
{
	FinalEx1()
	{
		System.out.println("This is Default constructor of constructor 1");
	}
	
	final int a=100;;
	final void show()
	{
		System.out.println(a);
	}
	final void welcome()
	{
		System.out.println("Welcome to ....");
	}
}
public class FinalExTest extends FinalEx1 {
//	public void show()
	{
		System.out.println("This method is extended");
	}
	public static void main(String[] args) {
		
	FinalEx1 f1 = new FinalEx1();
	f1.show();
}
}
