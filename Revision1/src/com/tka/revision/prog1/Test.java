package com.tka.revision.prog1;

public class Test {

	public static void main(String[] args) {
		
		Product p1 = new Product(1,"vishal",4000);
		Product p2 = new Product(2,"Aniket",5000);
		Product p3 = new Product(3,"Pushpak",8000);
		
		
		p1.display();
		p2.display();
		p3.display();
		
		
		Bill b1 = new Bill();
		
		b1.sendProduct(p1.cost,p2.cost,p3.cost);
		System.out.println("Total bill is:"+b1.total_bill);
	}
}
