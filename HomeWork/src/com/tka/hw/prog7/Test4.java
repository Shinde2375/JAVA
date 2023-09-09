package com.tka.hw.prog7;

public class Test4 {
public static void main(String[] args) {
	
	int n=5;
	printhalfPyramid(n,1);
	int m=1;
	printhalfNumber(m,4);
}

	public static void printhalfPyramid(int n,int row)
	
	{
		if(row>n)
		{
			return;
		}
		printPyramid(1,row);
		System.out.println();
		printhalfPyramid(n,row+1);	
	}
		public static void printPyramid(int num,int temp)
		{
			if(num>temp)
			{
				return;
		}
			System.out.print(num+"");
			printPyramid(num+1,temp);
	}
		
		public static void  printhalfNumber(int m ,int row)
		{
			if(m>row)
			{
				return;
			}
			printNumber(1,row);
			System.out.println();
			printhalfNumber(m,row-1);
		}
			public static void printNumber(int num,int temp)
			{
				if(num>temp)
				{
					return;
				}
				
				System.out.print(num+"");
				printNumber(num+1,temp);
			}
		}
	


