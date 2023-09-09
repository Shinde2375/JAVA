package com.tka.hw.prog8;

import java.util.ArrayList;

public class ArrayListDemo4 {

	public static void main(String[] args) {
		ArrayList<String>arr = new ArrayList<>();
		arr.add("Zero");
		arr.add("First");
		arr.add("Second");
		arr.add("Third");
		arr.add("Rndom");
		System.out.println("Actual Arraylist:"+arr);
		arr.clear();
		//this function use for deleting item from arraylist
		System.out.println("\n After clear ArrayList"+arr);
	}
}