package com.tka.hw.prog5;

import java.util.ArrayList;

public class Platina {

	int id;
	String model;
	String engine;
	
	ArrayList<Bike> b;
	
	@Override
	public String toString() {
		return "Platina [id=" + id + ", model=" + model + 
				"]";
	}
	public Platina(int id, String model, String engine, ArrayList<Bike> b) {
		super();
		this.id = id;
		this.model = model;
		this.engine = engine;
		this.b = b;
	}
	public Platina(int id, String model,ArrayList<Bike>b) {
		super();
		this.id = id;
		this.model = model;
//		this.engine = engine;
	}
	
	
}
