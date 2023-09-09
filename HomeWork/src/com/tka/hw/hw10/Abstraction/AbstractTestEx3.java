package com.tka.hw.hw10.Abstraction;

public class AbstractTestEx3 {

	public static void main(String[] args) {
		AbstractSubclassEx3 t1 = new AbstractSubclassEx3();
		
		t1.getName("JavaByKiran");
		t1.getCity("Pune");
		t1.getCountry("India");
		t1.getGender("Male");
		t1.display();
	}
}