package com.tka.day19.prog4;

import java.util.TreeMap;

import com.tka.day18.prog4.Product;
import com.tka.day18.prog5.empdemo.Employee;

public class Test {

	public static void main(String[] args) {
		demo d1 = new demo(34,"Amit");
		demo d2 = new demo(71,"Pankaj");
		demo d3 = new demo(1,"Abhay");
		demo d4 = new demo(45,"Prajakya");
		demo d5 = new demo(22,"Nisha");
		
		TreeMap<Integer,demo> d = new TreeMap<Integer,demo>();
		d.put(111, d1);
		d.put(444, d2);
		d.put(333, d3);
		d.put(222, d4);
		d.put(555, d5);
		
		d.entrySet().forEach(x->System.out.println(x.getKey()+" "+x.getValue()));
		
		
		d.keySet().forEach(k->System.out.println(k));
		
		
		d.values().forEach(v->System.out.println(v));
		
		d.entrySet().forEach(x->System.out.println(x.getKey()+" "+x.getValue()));
		
	}
}
