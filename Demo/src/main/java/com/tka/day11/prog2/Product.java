package com.tka.day11.prog2;

public class Product {
	
	int id;
	String name;
	float price;
	String description;
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", description=" + description + "]";
	}
	public Product(int id, String name, float price, String description) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
	}
	

}
