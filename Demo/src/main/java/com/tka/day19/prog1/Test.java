package com.tka.day19.prog1;					//DAY: SUNDAY , DATE : 27/8/2023

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.*;

public class Test {
/* WHAT IS MAP ?
 * 
 * IT IS STORED DATA IS KEY AND VALUE FORMAT
 * WHERE KEY IS UNIQUE
 * 
 * PAIR OF KEY AND VALUE IS TERMED AS ENTRY
 */
	
	
	
	public static void main(String[] args) {
		
		HashMap<Integer,String>hmap = new HashMap<Integer,String>();
		
//		hmap.put(12, "Vishal Shinde");
//		hmap.put(12, "Vishal Shinde");
//		hmap.put(12, "Vishal Shinde");
//		hmap.put(12, "Vishal Shinde");
//		hmap.put(12, "Vishal Shinde");
//
//		hmap.forEach((k,v) ->System.out.println(k+" "+v));
		
		
		
		hmap.put(11, "Vishal Shinde");
		hmap.put(12, "Aniket Shinde");
		hmap.put(13, "john Shinde");			//values can be override in hashmap
//		hmap.put(12, "shawn Shinde");
//		hmap.put(12, "Ram Shinde");

		
		
		hmap.forEach((k,v) ->System.out.println(k+" "+v));
		
		System.out.println();
		System.out.println("For finding Keys: \n");
		Set<Integer> keys = hmap.keySet();
		for(Integer t : keys)
			System.out.println(t);
		
		System.out.println();
		System.out.println("For displaying  values: \n");
		Collection<String> cv =hmap.values();
		for(String t:cv)
		{
			System.out.println(t);
		}
		
		System.out.println();
		System.out.println("For finding Keys: \n");
		
		Set<Entry<Integer,String>> entries = hmap.entrySet();
		for(Entry<Integer,String>entry:entries)
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
	}
}
