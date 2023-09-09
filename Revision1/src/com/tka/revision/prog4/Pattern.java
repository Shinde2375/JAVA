package com.tka.revision.prog4;
public class Pattern {	
	public static void main(String[] args) {
		int n=7342;
		while(n>0)
		{	int r = n%10;
		n = n/10;
		for(int i=1;i<=r;i++)
		{
			System.out.print(i+"");
		}
		System.out.println();
		}
		}
	}