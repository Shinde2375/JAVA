package com.tka.hw.prog4;

public class Transport {

	int id;
	String name;
	String type;
	@Override
	public String toString() {
		return "Transport [id=" + id + ", name=" + name + ", type=" + type + "]";
	}
	public Transport(int id, String name, String type) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
	}
	
}
