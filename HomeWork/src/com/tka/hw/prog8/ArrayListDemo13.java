package com.tka.hw.prog8;

import java.util.HashMap;

public class ArrayListDemo13 {
public static void main(String[] args) {
	// HashMap<K, V> hm = new HashMap();
	HashMap<String,String> hm = new HashMap<String,String>();
	//Both are in String type
	hm.put("One","Java");
	hm.put("Two","BY");
	hm.put("Three","Kiran");
	
	System.out.println(hm);
	System.out.println("Value of Second=:"+hm.get("Two"));
	//get element from hashmap using key
	System.out.println("is hashmap is empty:="+hm.isEmpty());
	//chech hash map is empty or not
	hm.remove("Thiree");
	//delete element from hasmap
	System.out.println(hm);
	//size of hashmap
	System.out.println("Size of HashMap:="+hm.size());
}
}