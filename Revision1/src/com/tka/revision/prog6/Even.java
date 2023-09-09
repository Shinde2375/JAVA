package com.tka.revision.prog6;

public class Even {
	public static void main(String[] args) {
		
		int a[] = {11,22,33,44,55};
		int b[]= new int[a.length];	
		
		
	
		for(int i=0;i<a.length;i++)
//		for(int i=a.length-1;i>=0;i--)
		{
			b[i] = a[i];
			
			System.out.println("print A: >>"+a[i]);
		}
		System.out.println(b[4]);
//		System.out.println(sum);
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println("print B: >>"+b[i]);
		}
	}
}