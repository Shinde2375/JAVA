package com.tka.hw.prog8;

public class Student {

int id;
String loc;
Phone phone;
@Override
public String toString() {
	return "Student [id=" + id + ", loc=" + loc + "]";
}
public Student(int id, String loc, Phone phone) {
	super();
	this.id = id;
	this.loc = loc;
	this.phone = phone;
}

public Student()
{	
}
}
