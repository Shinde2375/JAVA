package com.tka.revision.prog6;

public class smallest {
public static void main(String[] args) {
		int a[] = {5,3,4,1,9};
		int small = a[0];
	for(int i=0;i<a.length;i++)
	{
		if(small> a[i])
		{
			small = a[i];	
		}	
	}System.out.println(small);	
}
}