package com.tka.day10.prog1;						//DATE :- 12/07/2023

public class Test {

	public static void main(String[] args) {

//1ST

		for(int i=10;i<130;i+=10)
		{
			System.out.println(i);
			if(i==50)
				System.out.println(120);



		}
		System.out.println("________________________________________");
//2ND

		for(int i=11;i<=111111;i=i*10+1)
		{
			System.out.println(i);
		}


		System.out.println("________________________________________");

//3RD
		for(int i=111111;i>=11;i=i/10)
		{
			System.out.println(i);
		}


		System.out.println("________________________________________");
//4TH
		for(int i=11;i<=1111;i=i*10+1)
		{
			System.out.println(i*i);
		}

		System.out.println("________________________________________");
//5TH
		for(int i=1;i<7;i++)
		{for(int j=1;j<=5;j++)
		{
			if(i<=2 )
				System.out.print("#");
			else
				System.out.print("@");
		}
		System.out.println();
		}

		System.out.println("________________________________________");
//6TH
		for(int i=1;i<=10;i++)
		{for(int j=1;j<=5;j++)
		{
			if(i<=7  && j>=3 && i>3)

				System.out.print("#");
			else if(i>7)
				System.out.print("$");
			else
			{
				System.out.print("@");
			}

		}
		System.out.println();
		}
		

	}
}

