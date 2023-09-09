package com.tka.day18.prog2.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
public class Test {

	public static void main(String[] args) {
		Product p1 = new Product(11,"pen",20);
		Product p2 = new Product(13,"NoteBook",120);
		Product p3= new Product(51,"TextBook",600);
		Product p4 = new Product(71,"Marker",25);
		Product p5 = new Product(90,"bag",2000);
		
		HashSet<Product> p = new HashSet<Product>();
		
		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4);
		p.add(p5);
//		p.clear(); working
//		p.add(p5); working
		System.out.println(p.contains(p3));
		p.remove(p3);   //working
	//	p.add(3,p3); // not working
		
		
		System.out.println("1.____Method Refrence______");
		
		p.forEach(System.out::println);
		
		
	}
}
