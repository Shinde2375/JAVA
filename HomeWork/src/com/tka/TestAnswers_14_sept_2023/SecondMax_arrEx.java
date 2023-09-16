package com.tka.TestAnswers_14_sept_2023;

public class SecondMax_arrEx {

	public static void main(String[] args) {
		int a[] = {4,2,1,3,3};
		int temp = a[0];
		int temp2=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(temp<=a[i])
			{
				temp = a[i];
				 
			}
			
			if(temp2 >= temp)
			{
				temp2 = temp;
			}
		}
		System.out.println("max no from array is :"+ temp2);
	}

}

