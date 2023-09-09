package com.tka.prac.ALL;

public class Test2 {

	public static void main(String[] args) {
		
		int n=1;
		printNumbers(n,5,1);
	}
	public static void printNumbers(int n,int row,int col)
	{
		if(row<n)
		{
			return;
		}
		if(col>row)
		{
			System.out.println();
			printNumbers(n,row-1,1);
			return;
		}
		System.out.print(col+"");
		printNumbers(n,row,col+1);
	}
}
