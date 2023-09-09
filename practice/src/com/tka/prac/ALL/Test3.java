package com.tka.prac.ALL;

public class Test3 {
public static void main(String[] args) {
	int n=5;
	printPyramids(n,1,1);
}
public static void printPyramids(int n,int row,int col)
{
	if(row>n)
	{
		return;
	}
	if(col>row)
	{
		System.out.println();
		printPyramids(n,row+1,1);
		return;
	}
	System.out.print(col+"");
	printPyramids(n,row,col+1);
}
}
