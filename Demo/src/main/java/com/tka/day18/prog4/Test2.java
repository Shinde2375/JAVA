package com.tka.day18.prog4;

import java.util.*;
import java.util.Collections;
import java.util.TreeSet;

public class Test2 {
	public static void main(String[] args) {
		
		
		Product p1 = new Product(11,"pen",20);
		Product p2 = new Product(13,"NoteBook",120);				//does not allow insertion order // (mnj jasa input dilai tasa print nahi karat)
		Product p3= new Product(51,"TextBook",600);
		Product p4 = new Product(71,"Marker",25);
		Product p5 = new Product(90,"bag",2000);
		
		TreeSet<Product> p = new TreeSet<Product>();
		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4);
		p.add(p5);
	
		System.out.println("1.Sorting on the basis of the id using comparator");
		for(Product t:p)
			System.out.println(t);
		
		
	System.out.println("2.Sorting on the basis of the name using comparator");
	
	ArrayList<Product> b = new ArrayList<Product>();
	b.addAll(p);
	
	Collections.sort(b,new ProductNameComparator());
	b.forEach(s->System.out.println(s));
		
	System.out.println("3.Sorting on the basis of the price using comparator");

	Collections.sort(b,new ProductPriceComparator());
	b.forEach(s->System.out.println(s));
	

	}
}

