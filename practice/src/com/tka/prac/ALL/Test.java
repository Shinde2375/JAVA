
package com.tka.prac.ALL;								//DATE: 23/7/2023  DAY: SUNDAY
public class Test {
	public static void main(String[] args) {
int n=5;
printNumber(n,1,1);
int m=1;
printPyramid(m,4,1);
	}
	public static void printNumber(int n,int row,int col)
	{
		if(row>n)
		{
			return;
		}
		if(col>row)
		{
			System.out.println();
			printNumber(n,row+1,1);
			return;
		}
		System.out.print(col+"");
		printNumber(n,row,col+1);
	}
	
	


public static void printPyramid(int m,int row,int col)
{
	if(row<m)
	{
		return;
	}
	if(col>row)
	{
		System.out.println();
		printPyramid(m,row-1,1);
		return;
	}
	System.out.print(col+"");
	printPyramid(m,row,col+1);
}
}