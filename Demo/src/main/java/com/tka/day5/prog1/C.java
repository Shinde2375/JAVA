package com.tka.day5.prog1;

public class C {
	
	public static void main(String[] args) {
		Integer a = new Integer(10);
		int r = a.intValue();  //unboxing
		r = r+1;
		a = new Integer(r);
		
		System.out.println(a);
	}

}
