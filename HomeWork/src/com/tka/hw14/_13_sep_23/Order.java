package com.tka.hw14._13_sep_23;

import java.util.ArrayList;

public class Order {

	int id;
	Customer c;
	ArrayList<Product> list;
	
	
	
	public Order(int id, Customer c, ArrayList<Product> list) {
		super();
		this.id = id;
		this.c = c;
		this.list = list;
	}
	



	@Override
	public String toString() {
		return "Order [id=" + id + ", c=" + c + ", list=" + list + "]";
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public Customer getC() {
		return c;
	}




	public void setC(Customer c) {
		this.c = c;
	}




	public ArrayList<Product> getList() {
		return list;
	}




	public void setList(ArrayList<Product> list) {
		this.list = list;
	}




	float calcTotal()
	{
		float totalbill = 0.0f;
		for(int i=0;i<list.size();i++)
		{
			Product t =list.get(i);
			totalbill =  totalbill+t.Price;
		}
		return totalbill;
	}
	
	float calcDiscount()
	{
		float totalbill = 0.0f;
		float discount=0.0f;
		for(int i=0;i<list.size();i++)
		{
			Product t = list.get(i);
			totalbill =  totalbill+t.Price;
		}
		
		discount = (10*totalbill)/100;
		totalbill = totalbill-discount;
		return totalbill;	
	}	
}