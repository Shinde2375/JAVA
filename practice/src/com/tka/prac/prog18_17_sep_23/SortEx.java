package com.tka.prac.prog18_17_sep_23;

import java.util.Arrays;

public class SortEx {	
	public static void main(String[] args) {
		int a[]= new int[]{4,7,5,3,1,2};		
//		Arrays.sort(a);
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.print(a[i]);
//		}	
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				int temp =0;
				if(a[i]>a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;				
				}
			}
			System.out.println(a[i]);
		}	
	}
}