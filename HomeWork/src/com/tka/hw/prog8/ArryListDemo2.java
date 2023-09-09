package com.tka.hw.prog8;

import java.util.ArrayList;

public class ArryListDemo2 {

	public static void main(String[] args) {
		
		ArrayList<String> a1 = new ArrayList<>();
		a1.add("Perl");
		a1.add("PHP");
		System.out.println(a1);
		//get element by index
		System.out.println(a1.get(1));
		System.out.println("Does List Contain JAVA ?"+a1.contains(a1));
		System.out.println("Is arraylist empty ?"+a1.isEmpty());
		System.out.println("Index of PERL is"+a1.indexOf("PERL"));
		System.out.println("Size of the arraylist"+a1.size());
	}
}