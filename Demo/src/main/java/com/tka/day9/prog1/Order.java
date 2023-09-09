package com.tka.day9.prog1;

import java.util.ArrayList;

public class Order {

	int oid;
	String date;
	ArrayList<Product >list;
	
	@Override
	public String toString() {
		return "Order [oid=" + oid + ", date=" + date + ", list=" + list + "]";
	}
	public Order(int oid, String date, ArrayList<Product> list) {
		super();
		this.oid = oid;
		this.date = date;
		this.list = list;
	}
	
	
}
