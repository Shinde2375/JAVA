package com.tka.day18.prog4;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
//import java.util.ListIterator;
import java.util.TreeSet;

public class Test {

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
//			p.add(3,p3);
//			p.add(p5);
//			p.add(null);
			p.remove(p3);
//			p.clear();
			System.out.println(p.add(p4));
			System.out.println(p.contains(p5));
			
			
//			System.out.println("1. ____using simple for _____");
//
//			for(int i=0;i<p.size();++i)
//				System.out.println(p.get(i));

			System.out.println("2 .________Enhanced for ________");
			for(Product t:p)
			{
				
				System.out.println(t);
			}

			System.out.println("3.____Using Iterator______");
			Iterator<Product> itr = p.iterator();
			while(itr.hasNext())
			{
				Product t = itr.next();
				System.out.println(t);
			}


//			System.out.println("4._____Using ListIterator Forward______");
//			ListIterator<Product> itrs = p.listIterator(); 										//this will goes for forward and backward alsoo
//			while(itrs.hasNext())
//			{
//				Product t = itrs.next();
//				System.out.println(t);
//			}

//			System.out.println("4._____Using ListIterator Previous______");
//			while(itr.hasPrevious())
//			{
//				Product t = itr.previous();
//			System.out.println(t);
//		}
			System.out.println("5.______Collection Enumeration __________");
			Enumeration<Product> e = Collections.enumeration(p);
			while(e.hasMoreElements())
			{
				Product t = e.nextElement();
			System.out.println(t);
		}

			System.out.println("6.______Using foreach method __________");
			p.forEach(r ->System.out.println(r));

			System.out.println("7.______Using Method ref __________");
			p.forEach(System.out::println);	
	}
}
