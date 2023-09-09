package com.tka.hw.prog4;

import java.util.ArrayList;

public class Truck {
	int id;
	String name;
	ArrayList<Transport>trans;
	
	public Truck(int id, String name) {
		super();
		this.id = id;
		this.name = name;
//		this.type = type;
	}
	public Truck(int id, String name, ArrayList<Transport> trans) {
		super();
		this.id = id;
		this.name = name;
		this.trans = trans;
	}
	@Override
	public String toString() {
		return "Truck [id=" + id + ", name=" + name + ", trans=" + trans + "]";
	}

}
