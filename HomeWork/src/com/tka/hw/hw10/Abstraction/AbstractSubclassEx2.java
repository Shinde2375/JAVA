package com.tka.hw.hw10.Abstraction;

public class AbstractSubclassEx2 extends AbstractclassEx2{
int x,y,z;
	@Override
	void get(int a, int b) {
		// TODO Auto-generated method stub
		x =a;
		y=b;
	}

	@Override
	void add() {
		// TODO Auto-generated method stub
		z = x+y;
		
	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("addition is >>"+z);
	}
	
}
