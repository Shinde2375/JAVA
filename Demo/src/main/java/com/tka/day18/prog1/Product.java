package com.tka.day18.prog1;					//DAY: SATURDAY  DATE: 26/08/2023;

public class Product {

	int id;
	String name;
	float price;
	public Product()
	{
		
	}
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
}
