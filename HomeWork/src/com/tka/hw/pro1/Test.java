package com.tka.hw.pro1;

import java.util.ArrayList;



public class Test {

	public static void main(String[] args) {
		product p1 = new product();
		p1.id=1 ; p1.name="A";p1.price=92;
		
		
		product p2 = new product();
		p2.id=2 ; p2.name="	B";p2.price=100;
		
		
		product p3 = new product();
		p3.id=3 ; p3.name="C";p3.price=98;
		
		product p4 = new product();
		p4.id=4 ; p4.name="D";p4.price=82;
		
		product p5 = new product();
		p5.id=5 ; p5.name="E";p5.price=89;
		
		product p6 = new product();
		p6.id=6 ; p6.name="F";p6.price=97;
		
		product p7 = new product();
		p7.id=7 ; p7.name="G";p7.price=92;
		
		product p8 = new product();
		p8.id=8 ; p8.name="H";p8.price=95;
		
		product p9 = new product();
		p9.id=9 ; p9.name="I";p9.price=72;
		
		product p10 = new product();
		p10.id=10 ; p1.name="J";p10.price=92;
		
		
		
		
//		StudentFilter obj = new StudentFilter();
//		int count = obj.countAllFirstClass( s1, s2, s3, s4, s5);
//		System.out.println(count);
		
		
		ArrayList<product> ProductList = new ArrayList<>();
		
		ProductList.add(p1);
		ProductList.add(p2);
		ProductList.add(p3);
		ProductList.add(p4);
		ProductList.add(p5);
		ProductList.add(p6);
		ProductList.add(p7);
		ProductList.add(p8);
		ProductList.add(p9);
		ProductList.add(p10);
		
		
		Bill obj = new Bill();
		//int r = obj.calcBill(ProductList);
		
		double ans = obj.CalBill(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);
		System.out.println(ans);
	//	System.out.println(r);
}
}
