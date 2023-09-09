package com.tka.prac.prog16;
import java.util.Scanner;
public class Revno {
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the no :");
	int x = sc.nextInt();
	int sum=0;
	while(x>0)
	{
	int temp = x;
	
	
	int r = x%10;
	sum = sum+(r*r*r);
	x = x/10;
	
	
	}
	System.out.println("total sum is :"+sum);
}
}