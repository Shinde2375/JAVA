
package com.tka.basic.demo2;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.id=1 ; s1.name="Ram";s1.marks=92;
		
		
		Student s2 = new Student();
		s2.id=2 ; s2.name="sham";s2.marks=78;
		
		Student s3 = new Student();
		s3.id=3 ; s3.name="arun";s3.marks=58;
		
		Student s4 = new Student();
		s4.id=4 ; s4.name="bharat";s4.marks=48;
		
		Student s5 = new Student();
		s5.id=5 ; s5.name="abhi";s5.marks=87;
		
//		StudentFilter obj = new StudentFilter();
//		int count = obj.countAllFirstClass( s1, s2, s3, s4, s5);
//		System.out.println(count);
		
		
		ArrayList<Student> studentList = new ArrayList<>();
		
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
	
		
		StudentFilter filter = new StudentFilter();
		int r = filter.countAllFirstClass(studentList);
		int d = filter.countDistinction(studentList);
		int s = filter.countSecondClass(studentList);
		System.out.println("First Class="+r);
		System.out.println("Distinction="+d);
		System.out.println("Second Class="+s);
	}
}
