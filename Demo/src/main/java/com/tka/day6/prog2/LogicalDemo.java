package com.tka.day6.prog2;

public class LogicalDemo {
	public static void main(String[] args) {

		int a =102;
		int b=104;
		int c=102;

		//	if(a==b && a==c)
		//		System.out.println("All three are equal");
		//	
		//	else if(b==a && b>a)
		//		System.out.println("both b & c are equal and greater than a");
		//	
		//	else if(a==b && a>c)
		//		System.out.println("both a & b are equal and greater than c");
		//	
		//	if(a==c && a>b)
		//		System.out.println("both a & c are equal and greater than b");                    //1st methodd
		//	
		//	else if(c==b && c==a)
		//		System.out.println("All three are equal");
		//	else if(a>b && a>c)
		//		System.out.println("A is greator ");
		//	else if(b>a && b>c)
		//		System.out.println("B is greator ");
		//	else if(c>a && c>b)
		//		System.out.println("C is Greator");





		if(a>b && a>c )
			System.out.println("A is greator");

		else if(b>c)
			System.out.println("B is Greator");
		
		else 
			System.out.println("C is greator");

	}
}
