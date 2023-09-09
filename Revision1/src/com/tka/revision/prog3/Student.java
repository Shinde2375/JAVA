package com.tka.revision.prog3;

public class Student extends Person{

	String course;
	float per;
	public Student(int id, String name, int age, String course, float per) {
		super(id, name, age);
		this.course = course;
		this.per = per;
	}
	
	void display()
	{
		System.out.println("id :"+id+" name :"+name+" age :"+age+" course :"+course+" per :"+per);
	}
	
	
}
