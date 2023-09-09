package com.tka.day18.prog4;

public class Product implements Comparable<Product>{

	int id;
	String name;
	float price;
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
	public int compareTo(Product o) {

//		Product p1 =this;
//		Product p2 = o;
//		if(p1.id>p2.id)
//			return 1;
//		else if(p2.id>p1.id)
//			return -1;
//		else
//			return 0;
//		
		Integer i1 = this.id;		//comparison based on Intege id value
		Integer i2 = o.id;
		
//		Float i3 = this.price;
//		Float i4 = o.price;				//comparison based on Float Price value
//		
//		
//		String i5 = this.name;
//		String i6 = o.name;
//		
	
		
		return i1.compareTo(i2);
//		return i2.compareTo(i1);
	}
}