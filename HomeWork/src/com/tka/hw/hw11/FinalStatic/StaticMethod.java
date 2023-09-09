package com.tka.hw.hw11.FinalStatic;

public class StaticMethod {

	private String name;
	private static String Strrname="STATIC-STRING";
	
	public StaticMethod(String n)
	{
		this.name = n;
	}
	
	public static void testStaticMethod()
	{
		System.out.println("Hey i am in static method..");
		System.out.println(StaticMethod.Strrname);
	}
	
	public void testObjectMethod()
	{
		System.out.println("Hey im in non static method");
		System.out.println(StaticMethod.Strrname);
		System.out.println("name:"+this.name);
	}
	public static void main(String[] args) {
		StaticMethod.testStaticMethod();
		StaticMethod s1 = new StaticMethod("Vishal");
		s1.testObjectMethod();
	}
}