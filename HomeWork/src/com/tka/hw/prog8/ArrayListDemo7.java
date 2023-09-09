package com.tka.hw.prog8;
import java.util.ArrayList;
public class ArrayListDemo7 {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("Pune");
		arr.add("Mumbai");
		arr.add("Delhi");
		arr.add("Nagpur");
		System.out.println("Actual Arraylist :"+arr);
		String[]str = new String[arr.size()];
		arr.toArray(str);
		System.out.println("\n create an array content");
		System.out.println(str);
	}
}