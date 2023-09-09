package com.tka.hw.hw10.Abstraction;

public class InterfaceTestEx1 implements Interface1,Interface2 {

	@Override
	public void myMethod() {
		// TODO Auto-generated method stub
		System.out.println("Multiple Interface Example using Interfaces");
		
	}
	
	public static void main(String[] args) {
		InterfaceTestEx1 i1 = new InterfaceTestEx1();
		i1.myMethod();
	}
}