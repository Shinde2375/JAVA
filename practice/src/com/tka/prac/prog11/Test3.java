package com.tka.prac.prog11;

import java.util.ArrayList;

public class Test3 {

	public static void main(String[] args) {
		
		Product p1 = new Product(1,"Vishal",78536.1545);
		Product p2 = new Product(2,"Praful",48536.1545);
		Product p3 = new Product(3,"Shreyash",68536.1545);
		Product p4 = new Product(4,"mihir",88536.1545);
		
		ArrayList<Product> list = new ArrayList();
		
		list.add(p1);
//		list.add(p2);
//		list.add(p3);
		list.add(p4);
		
//		Product p[] = new Product[4];
//		
//		p[0]=p1;
//		p[1]=p2;
//		p[2]=p3;
//		p[3]=p4;
//		
//		for(int i=0;i< p.length;i++)
//		{
//			System.out.println(p[i]);
//		}
		
		
		Order o = new Order(1,"11/12/2023",list);
		System.out.println(o);
				

		
		
		
	}
}
