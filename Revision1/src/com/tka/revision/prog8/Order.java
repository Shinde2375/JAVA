package com.tka.revision.prog8;

import java.util.ArrayList;

public class Order {

	int id;
	Customer c;
	ArrayList<Product>list;
	@Override
	public String toString() {
		return "Order [id=" + id + ", c=" + c + ", list=" + list + "]";
	}
	public Order(int id, Customer c, ArrayList<Product> list) {
		super();
		this.id = id;
		this.c = c;
		this.list = list;
	}

	float calcTotal()
	{
		float totalbill= 0.0f;
		for(int i=0;i<list.size();i++)
		{
			Product t = list.get(i);
			totalbill = totalbill+t.price;
		}
		return totalbill;
	}
	
	float calcdisc()
	{
		float totalbill= 0.0f;
		float discount=0.0f;
		
		for(int i=0;i<list.size();i++)
		{
			Product t = list.get(i);
			totalbill = totalbill+t.price;
		}
		
		discount = (10*totalbill)/100;
		totalbill = totalbill-discount;
		return discount;
	}
}
