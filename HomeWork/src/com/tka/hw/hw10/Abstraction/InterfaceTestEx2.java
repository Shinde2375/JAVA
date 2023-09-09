package com.tka.hw.hw10.Abstraction;

public class InterfaceTestEx2  implements InterfaceEx4
{


	public void methods() {
		// TODO Auto-generated method stub
		System.out.println("This is method1");
	}

	public void methods2() {
		// TODO Auto-generated method stub
		System.out.println("This is method2");

	}
	
	public static void main(String[] args) {
		InterfaceTestEx2 e1 = new InterfaceTestEx2();
		e1.methods();
		e1.methods2();
		
	}
}
