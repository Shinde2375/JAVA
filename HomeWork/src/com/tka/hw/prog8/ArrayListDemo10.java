package com.tka.hw.prog8;

import java.util.HashSet;

public class ArrayListDemo10 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("JAVA");
		hs.add("BY");
		hs.add("KIRAN");
		hs.add("KARVENAGAR");
		hs.add("PUNA");
		
		System.out.println("First HashSet element:"+hs);
		
		HashSet<String> hsf = new HashSet<>();
		hsf.add("JAVA");
		hsf.add("J2EE");
		hsf.add("SELENIUM");
		System.out.println("Second HashSet:"+hsf);
		hs.retainAll(hsf);
		
		System.out.println(""+"Common hash set content from both:");
		System.out.println(hs);
 	}
}
