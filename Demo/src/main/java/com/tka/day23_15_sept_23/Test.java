package com.tka.day23_15_sept_23;
import java.util.ArrayList;
public class Test {
	public static void main(String[] args) {
		Product p1 = new Product(11, "Phillips TV", 32000);
		Product p2 = new Product(15, "Sony radio", 2000);
		Product p3 = new Product(17, "Phone mobile", 132000);
		Product p4 = new Product(21, "refrigrator", 40000);
		Product p5 = new Product(19, "washing machine", 34000);
		ArrayList<Product> list = new ArrayList<Product>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		for(Product t:list) {
			t.setPrice(t.getPrice()+(t.getPrice()*(0.20f)));
		}
		ArrayList<Product> basket = new ArrayList<Product>();
		basket.add(p3);
		basket.add(p4);
		basket.add(p5);
		Customer c =  new Customer(56,"Nitin","899999889");
		Order o1 = new Order(23, c, basket);
		System.out.println(o1.getC().getName());
		System.out.println(o1.getDt());
		System.out.println();
		ArrayList<Product>  prod = o1.getList();
		prod.forEach(p->System.out.printf("\n"+p.getName()+" "+p.getPrice()));		
		System.out.println();
		System.out.println();
		System.out.println(o1.calBill());
		o1.applyDiscount(20);
		System.out.println(o1.getFinalbill());
	}
}