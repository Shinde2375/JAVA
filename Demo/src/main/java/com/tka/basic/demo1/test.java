
package com.tka.basic.demo1;

public class test {

	public static void main(String[] args) {
		product p1 = new product();
		p1.id=101; p1.name="pencil"; p1.price=10;
		
		product p2 = new product();
		p2.id=103; p2.name="pen"; p1.price=30;
		
		product p3 = new product();
		p3.id=105; p3.name="notebook"; p3.price=120;
		
		Bill bill1 = new Bill();
		double ans = bill1.GenerateBill(p1, p2, p3);
		System.out.println(ans);
	}
}
