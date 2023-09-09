package com.tka.hw.hw10.Abstraction;

public class Tyre implements MovableEx2 , Rollable{
	@Override
	public boolean isRollable() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isMoveable() {
		// TODO Auto-generated method stub
		return false;
	}
	public static void main(String[] args) {
		Tyre t1 = new Tyre();
		System.out.println(t1.isMoveable());
		System.out.println(t1.isRollable());
	}
}