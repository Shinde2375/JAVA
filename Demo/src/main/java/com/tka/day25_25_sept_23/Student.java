package com.tka.day25_25_sept_23;

public class Student {

	int id;
	String name;
	float price;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	public Student(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}
