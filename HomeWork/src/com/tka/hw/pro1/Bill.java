package com.tka.hw.pro1;

import java.util.ArrayList;


public class Bill{
		public double CalBill(product p1,product p2,product p3,product p4,product p5,product p6,product p7,product p8,product p9,product p10)
		{double total = p1.price+p2.price+p3.price+p4.price+p5.price+p6.price+p7.price+p8.price+p9.price+p10.price;
		total = total-total*0.20;
		return total;
//			System.out.println(total);
}

//public class Bill
//{
//	double CalBill(ArrayList<product> p )
//	{
//		double totalBill = 0;
//		for(int i=0;i<p.size();i++)
//		{
//			product t = p.get(i);
//			totalBill += t.price;
//		}
//		totalBill = totalBill- totalBill*0.20;
//		return totalBill;
//	}

		

}