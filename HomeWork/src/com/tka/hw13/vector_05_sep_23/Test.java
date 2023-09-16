package com.tka.hw13.vector_05_sep_23;					//5-9-2023
import java.util.Vector;
public class Test {
	public static void main(String[] args) {	
	Employee e1 = new Employee(1, "Vishal", 11111.1f, "Analyst");
	Employee e2 = new Employee(2, "Aniket", 21111.1f, "Developer");
	Employee e3 = new Employee(3, "Tushar", 51111.1f, "Manager");
	Employee e4 = new Employee(4, "Tejas", 16111.1f, "Testor");
	Employee e5 = new Employee(5, "Shreyash", 31111.1f, "Manager");
	Vector<Employee> v1 = new Vector<Employee>();
	v1.add(e1);
	v1.add(e2);
	v1.add(e3);
	v1.add(e4);
	v1.add(e5);
	for(Employee t : v1)
	{
		if((t.role).equals("Manager"))
		{
			System.out.println(t);
		}
	}
}
}