package com.tka.day25_25_sept_23;

import java.util.ArrayList;
import java.util.List;

public class Test {
public static void main(String[] args) {
	Student s1 = new Student(1, "Vishal", 5000);
	Student s2 = new Student(2, "Aniket", 8000);
	Student s3 = new Student(3, "Ram", 4000);
	Student s4= new Student(4, "Sham", 7000);
	Student s5 = new Student(5, "Ban", 1000);
	
	List<Student>l = new ArrayList<Student>();
	
	l.add(s1);
	l.add(s2);
	l.add(s3);
	l.add(s4);
	l.add(s5);
	
	for(Student move : l)
	{
		System.out.println(move);
	}
}
}
