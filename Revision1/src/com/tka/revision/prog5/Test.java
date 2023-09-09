package com.tka.revision.prog5;

//import com.tka.revision.prog5.A.B;

public class Test {

	public static void main(String[] args) {
		 A objA = new A();
		 System.out.println("obj.a >> ");
		 objA.m1();
		 
		 B objB = new B();
		 System.out.println("obj.b >>");
		 objB.m1();
		 
		 A objC = new B();
		 System.out.println("Obj.c >>");
		 objC.m1();
	}
}
