package com.tka.day18.prog5.empdemo;

import java.util.*;

import com.tka.day18.prog4.ProductPriceComparator;

public class Test {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(1,"vishal",20000,"Manager");
		Employee e2 = new Employee(2,"Aniket",70000,"Developer");
		Employee e3 = new Employee(3,"Shubham",90000,"Manager");
		Employee e4 = new Employee(4,"Shreyash",30000,"Developer");
		Employee e5 = new Employee(5,"Pushpak",40000,"Developer");
		
		ArrayList<Employee> e = new ArrayList<Employee>();
		e.add(e1);
		e.add(e2);
		e.add(e3);
		e.add(e4);
		e.add(e5);
		
		for(int i =0;i<e.size();++i)
		{
		System.out.println(e.get(i));	
		}
		
		
		
		System.out.println("Sorting on the basis of Salary increased by 40%");
		for(Employee t:e)
		{
			t.salary = t.salary+(float)(t.salary*0.40);
//			System.out.print(t.salary);
			System.out.println(t);
		
		}
		
		System.out.println("3.Sorting on the basis of the price using comparator");

		Collections.sort(e,new EmployeeSalaeryComparator());
		e.forEach(s->System.out.println(s));
		
		
		System.out.println("3.Sorting on the basis of the managet role using comparator");
		for(Employee t:e)
		if((t.role).equals("Manager"))
		{
			System.out.println(t);
		}
		
	}
}
