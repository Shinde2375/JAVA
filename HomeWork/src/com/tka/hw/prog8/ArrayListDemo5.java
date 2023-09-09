package com.tka.hw.prog8;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo5 {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("First");
		arr.add("Second");
		arr.add("Third");
		arr.add("Random");
		List<String> list = new ArrayList<>();
		list.add("Second");
		list.add("Random");
		
		System.out.println("Does ArrayList contain all list elements?:"+arr.containsAll(list));
	list.add("one");
	System.out.println("\n Does arraylit contains all list element?:"+arr.containsAll(list));
}
}