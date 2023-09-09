package com.tka.prac.prog7;

class Student
{
	int id;
	String name;
	String position;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", position=" + position + "]";
	}
	public Student(int id, String name, String position) {
		super();
		this.id = id;
		this.name = name;
		this.position = position;
	}
	
	
}

class Faculty
{
	int id;
	String name;
	String position;
	@Override
	public String toString() {
		return "Faculty [id=" + id + ", name=" + name + ", position=" + position + "]";
	}
	public Faculty(int id, String name, String position) {
		super();
		this.id = id;
		this.name = name;
		this.position = position;
	}
	
}

class Staff
{
	int id;
	String name;
	String position;
	@Override
	public String toString() {
		return "Staff [id=" + id + ", name=" + name + ", position=" + position + "]";
	}
	public Staff(int id, String name, String position) {
		super();
		this.id = id;
		this.name = name;
		this.position = position;
	}
	
	
}

class Head
{
	int id;
	String name;
	String position;
	@Override
	public String toString() {
		return "Head [id=" + id + ", name=" + name + ", position=" + position + "]";
	}
	public Head(int id, String name, String position) {
		super();
		this.id = id;
		this.name = name;
		this.position = position;
	}
	
}



public class Clg {
	
	public static void main(String[] args) {
		Student s = new Student(1,"Vishal","Student");
		System.out.println(s);
		
		Faculty f = new Faculty(1,"Vishal","Teacher");
		System.out.println(f);
		
		Staff s1 = new Staff(1,"Vishal","Peun");
		System.out.println(s1);
		
		Head h = new Head(1,"Vishal","HOD");
		System.out.println(h
				);
	}
	

}
