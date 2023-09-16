package com.tka.hw14._13_sep_23;

public class Product {

	int id;
	String name;
	Float Price=0.0f;
	public Product(int id, String name, Float price) {
		super();
		this.id = id;
		this.name = name;
		Price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", Price=" + Price + "]";
	}
	
	
}
