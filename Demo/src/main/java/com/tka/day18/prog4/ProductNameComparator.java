package com.tka.day18.prog4;

import java.util.Comparator;



public class ProductNameComparator  implements Comparator<Product>{
	@Override
	public int compare(Product o1, Product o2) {
String  s1 = o1.name;
String  s2 = o2.name;
		return s1.compareTo(s2);
	}	
}