package com.tka.day18.prog5.empdemo;

import java.util.Comparator;

public class EmployeeSalaeryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		Float f1 = o1.salary;
		Float f2 = o2.salary;
		return f1 .compareTo(f2);
	}

}
