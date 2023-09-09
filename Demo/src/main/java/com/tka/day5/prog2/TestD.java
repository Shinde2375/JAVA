package com.tka.day5.prog2;

public class TestD {

	public static void main(String[] args) {
		String  s = "1000";
		int n = Integer.parseInt(s);    	//For Converting into Integer
		
		n = n+1;
		
		System.out.println(n+1); 			//this is an int value i.e op== 1002
		
		s = Integer.toString(n);     //for Converting into String
		System.out.println(s);
		
		System.out.println(s+1);   	//this is an String value i.e op == 10011
		
		

		
	}
}
