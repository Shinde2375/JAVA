package com.tka.hw.hw10.Abstraction;

public class Vehicle implements Moveable{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Average speed is: "+AVGSPEED);
	}
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();
		v1.move();
	}
}