package com.tka.hw.prog8;

import java.util.HashSet;
import java.util.Iterator;

public class ArrayListDemo8 {

	public static void main(String[] args) {
		HashSet<String>hs = new HashSet<>();
		hs.add("JAVA");
		hs.add("BY");
		hs.add("KIRAN");
		
		Iterator<String>itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}