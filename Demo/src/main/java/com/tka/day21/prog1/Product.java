package com.tka.day21.prog1;

import java.io.Serializable;

public class Product implements Serializable{

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