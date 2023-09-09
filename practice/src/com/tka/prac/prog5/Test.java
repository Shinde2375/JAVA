package com.tka.prac.prog5;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		shop s1 = new shop();
		s1.id = 1; s1.name="Vishal";s1.sal=14545;
		
		shop s2 = new shop();
		s2.id = 2; s2.name="Aniket";s2.sal=24545;
		
		shop s3 = new shop();
		s3.id = 3; s3.name="Sham";s3.sal=34545;
		
		ArrayList<shop>list = new ArrayList<shop>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
	shop s = new shop();
	double res = s.calavgSal(list);
	System.out.println(res);
	
	}
}
