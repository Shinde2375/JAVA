package com.series.code;
public class FibonacciSeries2 {
	static int n=0,n2=1,n3=0;
	static void printFibonacci(int count)
	{
		if(count>0)
		{
			n3=n+n2;
			n=n2;
			n2=n3;
			System.out.print(" "+n3);
			printFibonacci(count-1);
		}
	}
	public static void main(String args[])
	{
		int count=20; // 10  changed  to 20
		System.out.print(n+" "+n2);
		printFibonacci(count-2);
	}}