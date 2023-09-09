package com.tka.hw.prog8;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

		public static void main(String[] args) {
			ArrayList<String> arr = new ArrayList<>();
			arr.add("Pune");
			arr.add("Mumbai");
			arr.add("Nashik");
			arr.add("Nagar");
			Iterator<String>itr = arr.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
		}
}
}