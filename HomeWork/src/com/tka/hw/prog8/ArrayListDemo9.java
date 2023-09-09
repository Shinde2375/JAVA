package com.tka.hw.prog8;

import java.util.HashSet;

public class ArrayListDemo9 {

	public static void main(String[] args) {
		HashSet<String>hs = new HashSet<>();
		hs.add("JAVA");
		hs.add("BY");
		hs.add("KIRAN");
		System.out.println(hs);
		System.out.println("HashSet is Empty or Not="+hs.isEmpty());
		hs.remove("KarveNagar");
		System.out.println(hs);
		System.out.println("Size of HashSet :"+hs.size());
		System.out.println("Does HashSet contains First element:"+hs.contains("JAVA"));
	}
}