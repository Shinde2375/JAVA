package com.tka.hw14._13_sep_23;
import java.util.ArrayList;
public class Test {
	public static void main(String[] args) {		
		Customer c1 = new Customer(1,"vishal","12456");
		Product p1 = new Product(1, "Aniket", 201.45f);
		Product p2 = new Product(2, "Banana", 501.45f);
		Product p3 = new Product(3, "shandy", 301.45f);
		ArrayList<Product> list = new ArrayList<Product>();
		list.add(p1);
		list.add(p2);
		list.add(p3);	
		Order o =new Order(1, c1, list);
		System.out.println(c1.name +" Your total bill is"+o.calcTotal()+"$");
		System.out.println("your Total Bill is: "+"@ 10% Discount is"+o.calcDiscount()+"$");
	}
}