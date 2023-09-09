package com.tka.hw.prog8;

import java.util.ArrayList;

public class ArrayListDemo14 {
public static void main(String[] args) {
	ArrayList<Student>arst = new ArrayList<>();
	Student stu1 = new Student(11,"Pune",new Phone(212,4000));
	Student stu2 = new Student(12,"Pune2",new Phone(212,8000));
	Student stu3= new Student(13,"Pune3",new Phone(212,14000));
	Student stu4 = new Student(14,"Pune4",new Phone(212,3000));
	
	arst.add(stu1);
	arst.add(stu2);
	arst.add(stu3);
	arst.add(stu4);
	
	// Give me students having mobile with cost more than 5000

	for(Student student:arst)
	{
		Phone pp = student.phone;
		System.out.println(student.phone);
		System.out.println(student.loc);
		System.out.println(student.id);
		System.out.println(pp.MobNumber);
		System.out.println(pp.cost);
	}
}
}