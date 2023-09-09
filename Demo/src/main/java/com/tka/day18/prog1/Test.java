package com.tka.day18.prog1;								//DAY: SATURDAY  DATE: 26/08/2023;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		Product p1 = new Product(11,"pen",20);
		Product p2 = new Product(13,"NoteBook",120);
		Product p3= new Product(51,"TextBook",600);
		Product p4 = new Product(71,"Marker",25);
		Product p5 = new Product(90,"bag",2000);
		
		ArrayList<Product> p = new ArrayList<Product>();
		
		p.add(p1);
		p.add(p2);
//		p.add(p3);
		p.add(p5);
		p.add(p5);
		p.add(p5);
		p.add(p5);
//		p.clear();			//it can 
		p.add(3,p3);
		p.remove(p5);
		p.remove(p5);
		p.remove(p5);
		p.remove(p5);
		
		System.out.println(p.contains(p3));				//it returns boolean value & use to know & find data
		
		for(int i=0;i<p.size();++i)
		{		
			System.out.println(p.get(i));
		}
		System.out.println("__________________");
	
		p.add(1,p4);
		for(int i=0;i<p.size();++i)
		{
			System.out.println(p.get(i));
		}
	}
}



 //COLLECTION FRAMEWORK
/*
 * ArrayList >> it use to maintain insertion order .
 * duplicate value are allowed
 * 
 *  
 *  we have see today
 *  
 * public void clear();
 * public boolean add(object 0);
 * public void add(int index,Object o);
 * public boolean contains(Object o);
 * public Object Remove(Object o);
 * 
 */
		