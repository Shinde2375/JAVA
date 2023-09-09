package com.tka.hw.prog7;

public class Test3 {
public static void main(String[] args) {

	int n=5;
	printhalfNumber(n,1);
	int m=1;
	printhalfPyramid(m,5);
	
}

	public static void printhalfNumber(int n,int row)
	{
		if(n<row)
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
		
		public static void printhalfPyramid(int m,int row)
		{
			if(m>row)
			{
				return;
			}
			
			printhalfNumbers(1,row);
			System.out.println();
			printhalfPyramid(m,row-1);
			
		}
			public static void printhalfNumbers(int num,int temp)
			{
				if(num>temp)
				{
					return;	
			}
				System.out.print(num+"");
				printhalfNumbers(num+1,temp);
		}
	
}

