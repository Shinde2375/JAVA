package com.tka.hw.prog8;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo3 {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("First");
		arr.add("second");
		arr.add("third");
		arr.add("random");
		System.out.println("Before actual arraylist"+arr);
		List<String>list = new ArrayList<>();
		list.add("One");
		list.add("Two");
		list.addAll(list);
		System.out.println("\n after copying all the element"+arr);
	}
}