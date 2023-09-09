package com.tka.hw.prog2;

public class StringDemo {


	public static void main(String[] args) {
		String s = "Vishal";
		String s1 ="Shinde";
		String s2 = "VISHAL";
		String s3 = "Versatile";
		int a =4;
		int b=7;
		int c = 10;

		System.out.println("1 :"+s.concat(s1)); 			//Join Two Strings
		System.out.println("2 :"+Math.max(9, 5));			//Finding max no.
		System.out.println("3 :"+Math.min(8, 5));	 		//Finding min no.
		System.out.println("4 :"+s.startsWith(s1));		//this is an  method which give boolean value i.e true or false
		System.out.println("5 :"+s1.length());			//Shows length of chr
		System.out.println("6 :"+Math.random()); 			//Generate random no
		System.out.println("7 :"+s1.endsWith(s1));
		System.out.println("8 :"+s.equalsIgnoreCase(s2));	//Ignores Capital n Small letter n compare both String
		System.out.println("9 :"+s.replaceFirst("V","S"));
		System.out.println("10 :"+s.replaceFirst(s, s3));   
		System.out.println("11 :"+s.isBlank());
		System.out.println("12 :"+s.isEmpty());
		System.out.println("13 :"+Math.min(Math.min(a, b),c));
		System.out.println("14 :"+Math.max(Math.max(a, b),c));
		System.out.println("15 :"+Math.max(Math.min(a, b),c));
		System.out.println("16 :"+s3.hashCode());
		System.out.println("17 :"+s.replace("V","F"));
		System.out.println("18 :"+s.indent(5));				//Gives space then print o/p
		System.out.println("19 :"+s.repeat(5));					//Repeat for given no
		System.out.println("20 :"+s.toUpperCase());


	}
}
