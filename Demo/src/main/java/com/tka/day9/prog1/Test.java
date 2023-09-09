package com.tka.day9.prog1;							// DATE -: 10-7-2023

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		Product p1 = new Product(101,"Pen",20);
		Product p2 = new Product(102,"Pencil",10);
		Product p3 = new Product(103,"NoteBook",100);
		Product p4 = new Product(104,"Remote",2000);
		
		ArrayList<Product> product = new ArrayList<Product>();
		product.add(p1);
		product.add(p3);
		
		
		Order order = new Order(111,"20thDec2023",product);
		System.out.println(order);
	}

}


//6  example on is a & has a relation