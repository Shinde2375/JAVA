package com.tka.day3.prog3;

import java.util.ArrayList;



public class EmpService {

	int id;
	double sal;
	String name;
	
	double  calAvgSalary(ArrayList<EmpService> elist)
	{
		double sum = 0;
		for(int i=0;i<elist.size();++i) {
		EmpService e=	elist.get(i);
		sum = sum+e.sal;
		}
		sum = sum /elist.size();
		
		return sum;
	}
}