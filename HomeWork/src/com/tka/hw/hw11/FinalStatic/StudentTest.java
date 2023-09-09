package com.tka.hw.hw11.FinalStatic;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		s1.showData();
		s2.showData();
		
		Student.b++;
		s1.showData();
	}
}