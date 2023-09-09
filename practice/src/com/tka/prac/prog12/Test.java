package com.tka.prac.prog12;									//DATE: 21-7-2023 DAY:FRIDAY

public class Test {

	public static void main(String[] args) {
		//		for(int i=1;i<=5;i++)
		//		{
		//			for(int j=1;j<=5;j++)
		//			{
		//				if(i==1&&j>1 || i==2&&j>2 || i==3&&j>3 || i==4&&j>4 )
		//				{
		//					System.out.print(" ");
		//				}
		//				else
		//				System.out.print(j);
		//			}
		//			System.out.println();
		//		}
		//		
//				int rows=5;
//				for(int i=1;i<=rows;i++)
//				{
//					for(int j=1;j<=i;j++)
//					{
//						System.out.print(j+"");
//					}System.out.println();
//				}
//			}

//
//		        int rows = 5; 
//		        printHalfPyramid(rows);
//		    }
//		
//		    public static void printHalfPyramid(int n) {
//		        if (n >= 1) {
//		            printHalfPyramid(n - 1); 
//		            printNumbers(n);
//		            System.out.println(); 
//		        }
//		    }
//		
//		    public static void printNumbers(int n) {
//		        if (n >= 1) {
//		            printNumbers(n - 1);
//		            System.out.print(n + " "); 
//		        }
//		    }

		

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