package com.tka.day3.prog3;

import java.util.ArrayList;

import com.tka.day3.prog2.Employee;

public class Test {
public static void main(String[] args) {
	EmpService obj1 = new EmpService();
	obj1.id=1;obj1.name="pushkar";obj1.sal = 4000;
	
	EmpService obj2 = new EmpService();
	obj2.id=2;obj2.name="Vishal";obj2.sal = 5000;
	EmpService obj3 = new EmpService();
	obj3.id=3;obj3.name="shubham";obj3.sal = 6000;
	EmpService obj4 = new EmpService();
	obj4.id=4;obj4.name="arvind";obj4.sal = 7000;
	EmpService obj5 = new EmpService();
	obj5.id=5;obj5.name="abhi";obj5.sal = 8000;
	
	
	ArrayList<EmpService> elist = new ArrayList<EmpService>();
	elist.add(obj1);
	elist.add(obj2);
	elist.add(obj3);
	elist.add(obj4);
	elist.add(obj5);
	
	EmpService  obj = new EmpService();

	double res = obj.calAvgSalary(elist);
	System.out.println(res);
}
}