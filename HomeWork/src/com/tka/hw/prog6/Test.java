package com.tka.hw.prog6; 								//DATE :- 12/07/2023

public class Test {

	//"___________________________________________________________"
	public static void PrintNumbers(int num)
	{
		System.out.print(num);
		if(num<5)
		{
			PrintNumbers(num+1);						//Recursion
		}
		if(num == 5)
		{
			num = num-1;
		}
		else
			System.out.print(num);
	}

	//"____________________________________________________________"
	//
	public static void main(String[] args) {
		//		//1ST
		//
		//		for(int i=1;i<=3;i++)
		//		{
		//			for(int j=1;j<=15;j++)
		//			{
		//				if(j>=4 &&j<=6)
		//					System.out.print("@");
		//				else if(j>=10 && j<=12)
		//					System.out.print("#");
		//				else
		//					System.out.print(i);
		//			}
		//			System.out.println();
		//		}
		//
		//
		//
		//		System.out.println("________________________________");
		//		//2ND
		//
		//		for(int i=1;i<=5;i++)
		//		{
		//			for(int j=1;j<=5;j++)
		//			{
		//				System.out.print(i);
		//			}
		//			System.out.println();
		//		}
		//
		//		System.out.println("________________________________");
		//
		//		//3RD
		//
		//		for(int i=1;i<=3;i++)
		//		{
		//			int temp= 5;
		//			for(int j=1;j<=9;j++)
		//			{
		//
		//				if(j<=5)
		//					System.out.print(j);
		//				else
		//					System.out.print(--temp);
		//			}System.out.println();
		//
		//		}
		//
		//		System.out.println("________________________________");
		//		//4TH
		//		for(int i=1;i<=3;i++)
		//		{int temp=5;
		//		for(int j=1;j<=5;j++)
		//		{
		//			System.out.print(temp--);
		//
		//		}
		//		System.out.println();
		//		}
		//
		//		System.out.println("________________________________");
		////		
		////		
		////		
		//		
		//5TH
		PrintNumbers(1);
	}
}
