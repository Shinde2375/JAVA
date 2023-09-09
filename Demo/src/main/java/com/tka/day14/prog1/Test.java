package com.tka.day14.prog1;							// DATE: 25/7/23 ,DAY: MONDAY

public class Test {

	public static void main(String[] args) {
		A obj = new A();
		obj.m1();
		obj.doo();
		System.out.println("\n");

		B obj2 = new B();
		obj2.m1();
		obj2.doo();
		obj2.m2();
		obj2.doo();
		System.out.println("\n");

		A obj3 = new B();
		obj3.m1();
		obj3.doo();
		System.out.println("\n");

		A obj4 = new C();
		obj4.m1();
		obj4.doo();
		System.out.println("\n");

		C obj5 = new C();
		obj5.m1();
		obj5.doo();
		obj5.m2();
		obj5.doo();
		obj5.m3();
		obj5.doo3();
		System.out.println("\n");
		B obj6 = new C();
		{
			obj6.m1();
			obj6.doo();
			obj6.m2();
			obj6.doo();	
		}
		System.out.println("\n");
	}
}
