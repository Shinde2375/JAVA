package com.tka.prac.prog2;

import java.util.ArrayList;

public class Test {

public static void main(String[] args) {
	EmpService e1 = new EmpService();
	e1.id=1 ; e1.name="Vishal" ; e1.sal=14567;
	
	EmpService e2 = new EmpService();
	e2.id=2 ; e2.name="Aniket" ; e2.sal=24567;
	EmpService e3 = new EmpService();
	e3.id=3 ; e3.name="Ram"; e3.sal=34567;
	EmpService e4 = new EmpService();
	e4.id=4 ; e4.name="Sham" ; e4.sal=44567;
	
	ArrayList<EmpService > list = new ArrayList<EmpService>();
	
	list.add(e1);
	list.add(e2);
	list.add(e3);
	list.add(e4);
	
	EmpService e = new EmpService();
	
	double t = e.CalAvgSal(list);
	
	System.out.println(t);
	
	
}
}
