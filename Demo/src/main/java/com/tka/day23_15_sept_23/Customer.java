package com.tka.day23_15_sept_23;

public class Customer {
	private int id;
	private String name;
	private String phoneno;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int id, String name, String phoneno) {
		super();
		this.id = id;
		this.name = name;
		this.phoneno = phoneno;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", phoneno=" + phoneno + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	
	

	
}
