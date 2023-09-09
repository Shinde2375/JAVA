package com.tka.day11.prog2; 								//DATE: 13-07-2023

public class Test {

	public static void main(String[] args) {
		Product p1 = new Product(1,"pen",20,"Stationary");
		Product p2 = new Product(2,"pencil",10,"Stationary");
		Product p3 = new Product(3,"notebook",150,"Stationary");
//		ArrayList<Product> p = new ArrayList<Product>();
		
		Product p[] = new Product[3];
		p[0] = p1;
		p[1]=p2;
		p[2]=p3;
		
		for(int i=0;i<p.length;i++)
		{
			System.out.println(p[i]);
		}
	}
}

