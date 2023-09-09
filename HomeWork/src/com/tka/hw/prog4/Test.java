package com.tka.hw.prog4;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		Transport t1 = new Transport(1,"Truck","Goods");
		Transport t2 = new Transport(2,"Car","Passenger");
		Transport t3 = new Transport(3,"Aeroplane","Ludgage");
		
		ArrayList<Transport> trans = new ArrayList<Transport>();
		trans.add(t1);
		trans.add(t2);
		trans.add(t3);
		
		Truck t = new Truck(1,"Tata",trans);
		System.out.println(t);
		
		
	}
}
