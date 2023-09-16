package com.tka.hw14._13_sep_23;

public class Customer {

	int id;
	String name;
	String Phoneno;
	
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", Phoneno=" + Phoneno + "]";
		
		
	}


	public Customer(int id, String name, String phoneno) {
		super();
		this.id = id;
		this.name = name;
		Phoneno = phoneno;
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
		return Phoneno;
	}


	public void setPhoneno(String phoneno) {
		Phoneno = phoneno;
	}
	
}
