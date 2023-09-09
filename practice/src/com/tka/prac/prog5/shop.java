package com.tka.prac.prog5;

import java.util.ArrayList;

public class shop {
	
	int id;
	String name;
	int sal;
	
	double calavgSal(ArrayList<shop>list)
	{
		double sum=0;
		
		for(int i=0;i<list.size();++i)
		{
		  shop  s= list.get(i);
		  sum = sum+s.sal;
		}
		return sum;
		
	}

}
