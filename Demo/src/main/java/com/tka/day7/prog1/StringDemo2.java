package com.tka.day7.prog1;

public class StringDemo2 {

	public static void main(String[] args) {
		String s1 = new String("nisha");					//s1.... is a refrence Variable 
				String s2 = new String("nisha");
				//		if(s1==s2)
		
				if(s1.equals(s2))
					System.out.println("hello"); 			//Q) is String s1 & s2  are equal? 			
		
				else
					System.out.println("hi");
	}
}