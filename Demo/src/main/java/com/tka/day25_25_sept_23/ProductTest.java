package com.tka.day25_25_sept_23;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ProductTest {

	public static void main(String[] args) {
		
		Product p1 = new Product(2, "Stationary", 10000);
		Product p2 = new Product(1, "Food", 9000);
		Product p3 = new Product(3, "Milk", 11000);
		
		ArrayList<Product> p = new ArrayList<Product>();
		{
			p.add(p1);
			p.add(p2);
			p.add(p3);
		}		
		Collections.sort(null);
	}
}
