package com.tka.revision.prog2;

public class Test {
	public static void main(String[] args) {
	Student s1  = new Student(1,"Vishal",85);
	Student s2  = new Student(2,"Aniket",65);
	Student s3  = new Student(3,"rahul",55);
	s1.display();
	s2.display();
	s3.display();
	cond(s1.per,s2.per,s3.per);	
}	private static void cond(float per, float per2, float per3) {		
		if(per>=75)
		{
			System.out.println(per);
		}else if(per2>=75)
		{
			System.out.println(per2);
		}
		else if(per>=75)
		{
			System.out.println(per3);
		}}}