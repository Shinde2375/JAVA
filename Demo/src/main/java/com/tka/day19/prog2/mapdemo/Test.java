package com.tka.day19.prog2.mapdemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		Employee e1 = new Employee(1,"Vishal",14000,"Manager");
		Employee e2= new Employee(2,"aniket",24000,"CEO");
		Employee e3 = new Employee(1,"RAM",74000,"Developer");
		Employee e4 = new Employee(1,"SAM",54000,"Staff");
		
		HashMap<Integer,Employee>e = new HashMap<Integer,Employee>();
		e.put(111, e1);
		e.put(222, e2);
		e.put(333, e3);
		e.put(444, e4);
		
		
		
		e.keySet().forEach(k->System.out.println(k));
		
		
		e.values().forEach(v->System.out.println(v));
		
		e.entrySet().forEach(x->System.out.println(x.getKey()+" "+x.getValue()));
		
		
		
//		Set<Integer> keys = e.keySet();
//		for(Integer t: keys)
//		{
//			System.out.println(t);
//		}
//		Collection<Employee>emps=e.values();
//		for(Employee m:emps)
//			System.out.println(m);
//		
//		Set<Entry<Integer,Employee>>entries = e.entrySet();
//		for(Entry<Integer,Employee> x :entries)
//		{
//			System.out.println(x.getKey()+" "+x.getValue());
//		}
		
	}
}
