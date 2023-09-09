package com.tka.day5.prog2;

public class TestE {
public static void main(String[] args) {
	String s = "555"; 					//We can not use string directly to binary coz string can not convert directlyy
	
	//converting this no in binaryy
	
	//Question == Diffrence in Wrapper class and primitive  with the help of example
	
	int n = Integer.parseInt(s);	
	System.out.println(Integer.toBinaryString(n));   //For converting int to Binary
	System.out.println(Integer.toOctalString(n)); //In converting int to Octal no.
	System.out.println(Integer.toHexString(n)); 	//in HexaDecimal	
}
}
