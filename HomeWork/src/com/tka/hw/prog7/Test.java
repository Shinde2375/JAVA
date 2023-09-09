package com.tka.hw.prog7;									//DATE : 22/7/2023  DAY : saturday

public class Test {
public static void main(String[] args) {
	

	int n=5;
	printhalfNumber(n,1);
}
	public static void printhalfNumber(int n,int row)
	{
		if(row>n)
		{
			return;
		}
		printNumbers(1,row);
		System.out.println();
		printhalfNumber(n,row+1);
	}	
		public static void printNumbers(int num,int temp)
		{
			if(num >temp)
			{
				return;
			}
			System.out.print(num+"");
			printNumbers(num+1 ,temp);
			
		}
	
}
	

