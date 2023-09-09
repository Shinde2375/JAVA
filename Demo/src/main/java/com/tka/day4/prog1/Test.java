package com.tka.day4.prog1;

import java.util.ArrayList;

public class Test {
	// TODO Auto-generated constructor stub
public static void main(String[] args) {
	
	
//	Voter v = new Voter();
//	v.id=0;v.name="arun";v.age=78;				...1st methodd
//	System.out.println(v);
	
//	Voter v1 = new Voter(1,"Vishal",23);
//	Voter v2 = new Voter(2,"Ram",33);
//	Voter v3 = new Voter(3,"Sham",25);					...//2nd methoddd
//	
//	System.out.println(v1);
//	System.out.println(v2);
//	System.out.println(v3);
	
	
	
	
	
	
	
	Voter v1 = new Voter(1,"Vishal",23);
	Voter v2 = new Voter(2,"Ram",33);
	Voter v3 = new Voter(3,"Sham",25);	
	
	ArrayList<Voter> al = new ArrayList<Voter>();
	
	al.add(v1);
	al.add(v2);
	al.add(v3);

	for(int i=0;i<al.size();++i)
	{
		System.out.println(al.get(i));
	}
}
}
