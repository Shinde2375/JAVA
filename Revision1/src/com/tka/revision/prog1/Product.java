package com.tka.revision.prog1;

public class Product {

	int id;
	String name;
	double cost;
	
	
	
	public Product(int id, String name, double cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
	}
	
	
	public void display()
	{
		System.out.println("id :"+id+","+"name :"+name+","+"Cost :"+cost);
	}
	
	
}
