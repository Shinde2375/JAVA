package com.tka.day23_15_sept_23;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Order {
	private int id ;
	private Customer c; 
	private ArrayList<Product> list;
	private LocalDateTime dt;
	private float finalbill;

	public Order(int id, Customer c, ArrayList<Product> list) {
		super();
		this.id = id;
		this.c = c;
		this.list = list;
		dt = LocalDateTime.now();
	}

	float calBill() {
		float bill = 0.0f;
		for(Product p:list) {
			bill=bill+ p.getPrice(); 
		}
		finalbill = bill;
		return bill;
	}

	void applyDiscount(float discount) {
		if(discount<=100)
			finalbill  =  finalbill - finalbill*(discount/100); 
		else
			System.out.println("Discount aur paise saath main nahi milte");
	
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




	public float getFinalbill() {
		return finalbill;
	}

	public void setFinalbill(float finalbill) {
		this.finalbill = finalbill;
	}

	public ArrayList<Product> getList() {
		return list;
	}




	public void setList(ArrayList<Product> list) {
		this.list = list;
	}




	public LocalDateTime getDt() {
		return dt;
	}




	public void setDt(LocalDateTime dt) {
		this.dt = dt;
	}




	@Override
	public String toString() {
		return "Order [id=" + id + ", c=" + c + ", list=" + list + ", dt=" + dt + "]";
	}



}
