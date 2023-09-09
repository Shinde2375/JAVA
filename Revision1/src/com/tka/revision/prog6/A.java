package com.tka.revision.prog6;

public class A {

	public static void main(String[] args) {
		
		int a[] = {11,22,33,44,55};
		int sum =0;
		for(int i=0;i<a.length;i++)
		{
			sum = sum+a[i];
//			System.out.println(i);
		}
		System.out.println(sum);
	}
}
