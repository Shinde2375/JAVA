package com.tka.prac.prog1;

import java.util.ArrayList;



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
		ArrayList<EmpService> list = new ArrayList<EmpService>();
		
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		list.add(obj4);
		
		EmpService e= new EmpService();
		
		double t = e.calAvgSalary(list);
		System.out.println(t);
		
		
	}

}
