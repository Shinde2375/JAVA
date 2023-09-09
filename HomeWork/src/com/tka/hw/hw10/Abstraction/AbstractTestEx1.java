package com.tka.hw.hw10.Abstraction;



 public class AbstractTestEx1 extends AbstractclassEx1{

	@Override
	public void disp2() {
		// TODO Auto-generated method stub
		System.out.println("im overriding abstract method..");
	}
	
	public static void main(String[] args) {
		AbstractTestEx1 t1 = new AbstractTestEx1();
		t1.disp1();
		t1.disp2();
	}
}