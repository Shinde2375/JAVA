package com.tka.prac.prog4;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		Voter v1 = new Voter(1,"Vishal",23);
		Voter v2 = new Voter(2,"Aniket",24);
		Voter v3 = new Voter(3,"Sham",25);
		
		ArrayList<Voter> v = new ArrayList<Voter>();
		v.add(v1);
		v.add(v2);
		v.add(v3);

		
		for(int i=0;i<v.size();++i)
		{
			System.out.println(v.get(i));
		}
	}
}
