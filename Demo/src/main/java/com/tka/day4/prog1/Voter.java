package com.tka.day4.prog1;

public class Voter {

	int id;
	String name;
	int age;

	
	
	public Voter(int id, String name, int age) {
	super();
	this.id = id;													//......2nd methoddd
	this.name = name;
	this.age = age;
}
	
	@Override
	public String toString() {
		return "Voter [id=" + id + ", name=" + name + ", age=" + age + "]";   //.....1st metodd
	}
	
	
}
