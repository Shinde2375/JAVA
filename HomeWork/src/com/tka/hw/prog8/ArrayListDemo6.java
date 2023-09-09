package com.tka.hw.prog8;

import java.util.ArrayList;

public class ArrayListDemo6 {

	public static void main(String[] args) {
		ArrayList<String>arr = new ArrayList<>();
		arr.add("Pune");
		arr.add("Mumbai");
		arr.add("Delhi");
		arr.add("Nagpur");
		System.out.println("Actual arrayList:"+arr);
		String[]strarr = new String[arr.size()];
		arr.toArray(strarr);
		System.out.println("\n Create array count: ");
		{
			for(String str:strarr)
			{
				System.out.println(str);}
			}
		}
	}