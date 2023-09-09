package com.tka.revision.prog2;

public class Student {
	int id;
	String name;
	float per;
	
	
	
	public Student(int id, String name, float per) {
		
		this.id = id;
		this.name = name;
		this.per = per;
	}
	
	public void display()
	{
		System.out.println(id+" "+ name+ " " +per);
	}
}
