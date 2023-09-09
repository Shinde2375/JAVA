package com.tka.hw.prog7;

public class Test2 {
public static void main(String[] args) {

//	int n=1;
//	printhalfNumber(n,5);
//}
//	public static void printhalfNumber(int n,int row)
//	{
//		if(n>row)
//		{
//			return;
//		}
//		printNumbers(1,row);
//		System.out.println();
//		printhalfNumber(n,row-1);
//	}	
//		public static void printNumbers(int num,int temp)
//		{
//			if(num >temp)
//			{
//				return;
//			}
//			System.out.print(num+"");
//			printNumbers(num+1 ,temp);
//			
//		}
	
	int n=1;
	printNum(n,5,1);
}
public static void printNum(int n,int row,int col)
{
	if(row<n)
	{
		return;
	}
	if(col>row)
	{
		System.out.println();
		printNum(n,row-1,1);
		return;
	}
	System.out.print(col+"");
	printNum(n,row,col+1);
}
	
}

