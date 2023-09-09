package com.tka.day3.prog1;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		Order obj1 = new Order();
		obj1.oid=111;obj1.cname="Vishal";obj1.cprodlist="pen,pencil";obj1.totalbill=30;
		
		
		Order obj2= new Order();
		obj2.oid=112;obj2.cname="parag";obj2.cprodlist="Bag,Rubadd";obj2.totalbill=2000;

		
		Order obj3 = new Order();
		obj3.oid=113;obj3.cname="Shubham";obj3.cprodlist="ink,Bottle";obj3.totalbill=486;

		
		Order obj4 = new Order();
		obj4.oid=114;obj4.cname="Shreyash";obj4.cprodlist="book,NoteBook";obj4.totalbill=300;

		
		Order obj5 = new Order();
		obj5.oid=115;obj5.cname="Shivram";obj5.cprodlist="Laptop,Tab";obj5.totalbill=3000;
		
		ArrayList<Order> OrderList = new ArrayList<Order>();
		OrderList.add(obj1);
		OrderList.add(obj2);
		OrderList.add(obj3);
		OrderList.add(obj4);
		OrderList.add(obj5);
		
		
		System.out.println(OrderList.size());		
//		System.out.println(OrderList.get(0).toString());
//		
//		Order t = (Order)OrderList.get(4);
//		System.out.println(" "+t);
		
		
		for(int i=0;i<OrderList.size();++i) {
			Order t = (Order)OrderList.get(i);
			System.out.println(""+t);
		}
		
		

	}
}
