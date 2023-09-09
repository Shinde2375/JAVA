package com.tka.prac.prog4;

public class Voter {
	
	int id;
	String name;
	int age;
	
	
	public Voter(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}


	@Override
	public String toString() {
		return "Voter [id=" + id + ", name=" + name + ", sal=" + age + "]";
	}
	
	

}
