package com.tka.hw.hw10.Abstraction;

public class AbstractSubclassEx4 extends AbstractEx4 {

	String Name ;
	@Override
	void getVal(String name) {
		// TODO Auto-generated method stub
		this.Name = name;
	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("Hello  "+ Name);
	}	
}
