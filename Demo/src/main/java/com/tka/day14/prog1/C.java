package com.tka.day14.prog1;

class A
{
	void m1()
	{
		System.out.println("AAA");
	}
	void doo()
	{
		System.out.println("hii");
	}
}

class B extends A
{
	void m2()
	{
		System.out.println("BBB");
	}
	void doo()
	{
		System.out.println("Hello");
	}
}
class C extends B
{
	void m3()
	{
		System.out.println("CCC");
		
	}
	void doo3()
	{
		System.out.println("good morning");
	}
}