package com.tka.hw.prog8;

import java.util.HashMap;
import java.util.Set;

public class ArrayListDemo11 {

	public static void main(String[] args) {
		
		// Program for Iterating through each key get corresponding value object

		HashMap<String,String>hm = new HashMap<String,String>();
		hm.put("FIRST", "JAVA");
		hm.put("SECOND", "BY");
		hm.put("THIRD", "KIRAN");
		System.out.println(hm);
		Set<String> keys = hm.keySet();
		for(String key : keys)
		{
			System.out.println("Value of "+key+" is :"+hm.get(key));
		}	
	}
}