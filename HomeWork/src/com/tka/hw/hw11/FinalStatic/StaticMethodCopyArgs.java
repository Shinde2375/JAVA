package com.tka.hw.hw11.FinalStatic;

public class StaticMethodCopyArgs {
	public static void copyVariables(String str1,String str2)
	{
		str2 = str1;
		System.out.println("First String args is:"+str1);
		System.out.println("Second String args is:"+str2);
	}
	public static void main(String[] args) {
		StaticMethodCopyArgs.copyVariables("PQR", "DEF");
		copyVariables("XYZ","ABC");
	}
}