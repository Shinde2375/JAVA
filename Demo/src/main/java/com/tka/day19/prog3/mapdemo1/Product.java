package com.tka.day19.prog3.mapdemo1;

public class Product {

	int id;
	String name;
	int price;
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	public Product(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	
	
}
