package com.tka.hw13.vector_05_sep_23;

public class Employee {
int id;
String name;
float sal;
String role;

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + ", role=" + role + "]";
}
public Employee(int id, String name, float sal, String role) {
	super();
	this.id = id;
	this.name = name;
	this.sal = sal;
	this.role = role;
}
}
