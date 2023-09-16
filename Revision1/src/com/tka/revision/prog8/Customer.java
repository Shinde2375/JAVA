package com.tka.revision.prog8;

public class Customer {

	int id;
	String name;
	String phoneno;
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", phoneno=" + phoneno + "]";
	}
	public Customer(int id, String name, String phoneno) {
		super();
		this.id = id;
		this.name = name;
		this.phoneno = phoneno;
	}
	
	
}
