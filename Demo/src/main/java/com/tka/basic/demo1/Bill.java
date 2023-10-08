package com.tka.basic.demo1;
public class Bill
{
	public double GenerateBill(product p1,product p2,product p3)
	{
		double total = p1.price+p2.price+p3.price;
		
		total = total-total*0.10;
		
		return total;
	}
}