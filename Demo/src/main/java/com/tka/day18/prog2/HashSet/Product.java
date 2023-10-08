package com.tka.day18.prog2.HashSet;

public class Product implements Comparable<Product> {

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
	@Override
	public int compareTo(Product s) {
		// TODO Auto-generated method stub
		return this.id - s.id;
	}	
}