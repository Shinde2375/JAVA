package com.tka.prac.prog2;

import java.util.ArrayList;

public class EmpService {

	int id;
	String name;
	double sal;
	
	double CalAvgSal(ArrayList<EmpService> list)
	{
		
		double sum = 0;
		for(int i =0;i<list.size();++i)
		{
			EmpService e = list.get(i);
			
			sum = sum+e.sal;
		}
		sum = sum/list.size();
	return sum;	
	}
}
