package com.tka.TestAnswers_14_sept_2023;

public class SortingArr_Ex {

	public static void main(String[] args) {
	int a[] = {4,2,1,5,3};
//	int temp = a[0];
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			int temp = a[i];
			int temp2 = a[j];
			
			if(temp>temp2)
			{
				a[i]= temp2;
				a[j] = temp;
			}
		}
	}
	for(int c :a)
	{
		System.out.print(" "+c);
	}
}
}
