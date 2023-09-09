package com.tka.day19.prog3.mapdemo1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		Product p1 = new Product(1,"soap",40);
		Product p2 = new Product(2,"book",90);
		Product p3 = new Product(3,"bag",4000);
		Product p4 = new Product(4,"umberella",400);
	
	HashMap<Integer,Product> p = new HashMap<Integer,Product>();
	p.put(111, p1);
	p.put(222, p2);
	p.put(333, p3);
	p.put(444, p4);
	
	
//	System.out.println("Displaying all the Keys: \n");
//	Set<Integer>keys = p.keySet();
//	for(Integer t:keys)
//	System.out.println(t);
//	
//	System.out.println("Displaying all the Values: \n");
//																								this is the leanthy processsss;
//	Collection<Product>pv = p.values();
//	for(Product m:pv)
//	{
//		System.out.println(m);
//	}
//	
//	System.out.println("Displaying all keys and values : \n");
//	Set<Entry<Integer,Product>> entries = p.entrySet();
//	for(Entry<Integer,Product> y:entries)
//	{
//		System.out.println(y.getKey()+" "+y.getValue());
//	}
//	
	
	
	
	p.keySet().forEach(k->System.out.println(k));
	
	
	p.values().forEach(v->System.out.println(v));
	
	p.entrySet().forEach(x->System.out.println(x.getKey()+" "+x.getValue()));
	
	
	}
}
