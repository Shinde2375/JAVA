
package com.tka.day8.prog1;

public class LoopDemo {

	public static void main(String[] args) {
		//  1)

		// i ------> Row;
		// j ------> Column;
		for(int i=1;i<=5;++i)
		{

			for(int j=1;j<=5;++j)
			{
				//if(j==1 || j==5 || i==1 || i==5)
				//if(i<=3)
				//if(i>=2&&i<=4)

				if(i<=2)
					System.out.print("@");

				else if(i==3)

					System.out.print("$");
				else
					System.out.print("#");
			}
			System.out.println();
		}
		System.out.println("______________________________________");

		//__________________________________________________________________
		//2)

		for(int i=1;i<=5;++i)
		{
			for(int j=1;j<=5;++j)
			{
				System.out.print("("+i+","+j+")");
			}
			System.out.println();
		}

		//
		System.out.println("______________________________________");
		//	3)	

		for(int i=1;i<=5;++i)
		{
			for(int j=1;j<=5;++j)
			{
				if(i==3 && j==3)
					System.out.print("#");

				else
					System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("______________________________________");

		//______________________________________________________________
		//	4)

		for(int i=1;i<=5;++i)
		{
			for(int j=1;j<=5;++j)
			{
				//if(i==1 || i==3 || i==5)

				if(i%2 ==1)
					System.out.print("#");

				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
}
