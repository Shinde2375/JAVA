package com.tka.day3.prog2;

import java.util.ArrayList;

import com.tka.day3.prog1.Order;

public class Test {

	public static void main(String[] args) {
		
	
	Employee e1 = new Employee();
	e1.eid = 1; e1.esalary=8000;e1.designation="employee";e1.dob="2001";e1.ename="Vishal";
	
	Employee e2 = new Employee();
	e2.eid = 2; e2.esalary=9000;e2.designation="employee"; e2.dob="2002";e2.ename="mihir";
	
	Employee e3 = new Employee();
	e3.eid = 3; e3.esalary=7000;e3.designation="employee";e3.dob="2003";e3.ename="parag";
	
	Employee e4 = new Employee();
	e4.eid = 4; e4.esalary=6000;e4.designation="employee";e4.dob="2004";e4.ename="sam";
	
	Employee e5 = new Employee();
	e5.eid = 5
			; e5.esalary=8000;e5.designation="employee";e5.dob="2005";e5.ename="shivam";
	
	ArrayList<Employee> OrderList = new ArrayList<Employee>();
	OrderList.add(e1);
	OrderList.add(e2);
	OrderList.add(e3);
	OrderList.add(e4);
	OrderList.add(e5);
	
	System.out.println(OrderList.size());
	
	
	for(int i=0;i<OrderList.size();++i) {
		Employee t = (Employee)OrderList.get(i);
		System.out.println(""+t);
		
	
	
}
}
}
