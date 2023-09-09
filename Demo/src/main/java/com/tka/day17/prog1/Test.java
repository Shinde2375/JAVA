package com.tka.day17.prog1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		
		System.out.println("Enter two no");
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		try {
			int r = a/b;
			System.out.println(r);
			
		} catch (Exception e) {

		e.printStackTrace();
		System.out.println("catch");
		 
		}
		finally {
			System.out.println("Finally");
		}
	}
}