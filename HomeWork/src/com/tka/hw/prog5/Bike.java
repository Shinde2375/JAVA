package com.tka.hw.prog5;

public class Bike {

	int id;
	String type;
	String model;
	@Override
	public String toString() {
		return "Bike [id=" + id + ", type=" + type + ", model=" + model + "]";
	}
	public Bike(int id, String type, String model) {
		super();
		this.id = id;
		this.type = type;
		this.model = model;
	}
	
	
}
