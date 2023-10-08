package com.tka.day25_25_sept_23;

public class Product {
int id;
String name;
float salary;
@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}
public Product(int id, String name, float salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}
}