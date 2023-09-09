package com.tka.hw.hw12.ExceptionHandling;

public class ArrayIndexOutOfBoundEx {

	public static void main(String[] args) {
		try
		{
			int a[] = new int[10];
			a[11] = 9;
			for(int i=0;i<=11;i++)
			{
				System.out.println(a[i]);
			}
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bondd");
			}
	}
}	