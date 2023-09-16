package com.tka.TestAnswers_14_sept_2023;

public class MinArr_Ex {

	public static void main(String[] args) {
		int a[] = {4,2,1,5,3};
		int temp = a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(temp>=a[i])
			{
				temp =a[i];
			}
		}
		System.out.println("Min no from array is :"+ temp);
	}
}