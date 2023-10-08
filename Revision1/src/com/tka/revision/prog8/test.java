package com.tka.revision.prog8;

import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
		
		Product p1 = new Product(1, "TV", 32000);
		Product p2 = new Product(2, "radio", 12000);
		Product p3 = new Product(3, "fridge", 72000);
		Product p4 = new Product(4, "oven", 52000);
		
		ArrayList<Product> list = new ArrayList<Product>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		
		ArrayList<Product> basket = new ArrayList<Product>();
		basket.add(p4);
		basket.add(p1);	
		for(Product t :list)
		{
			t.price = t.price+(t.price*(0.20f));
		}	
		Customer c = new Customer(1, "Vishal", "78945612307");
		Order o = new Order(23, c, basket);
		System.out.println(o.c.name);
		System.out.println();
		ArrayList<Product> prod = o.list;
		prod.forEach(p->System.out.println("\n"+p.name+" "+p.price));
	System.out.println("Total Bill are :"+o.calcTotal());
	}
}