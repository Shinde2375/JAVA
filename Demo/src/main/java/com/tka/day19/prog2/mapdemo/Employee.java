package com.tka.day19.prog2.mapdemo;

public class Employee {

	int id;
	String name;
	int sal;
	String role;
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + ", role=" + role + "]";
	}
	public Employee(int id, String name, int sal, String role) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.role = role;
	}
}
	
