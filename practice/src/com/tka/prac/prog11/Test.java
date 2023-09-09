package com.tka.prac.prog11; 				//DAY - Sunday , DATE - 16/7/2023

public class Test {

	public static void main(String[] args) {
		 
		
		int i=5 , j =5, k = 5;
		int a=5,b=5,d =5 , f=5,g=5;
		int m=5,n=5,x=5,y=5,z=5;
		
		
		
		
		 i = i++ + ++i;
		System.out.println(i);
		
		int c=  a+b+a++ + b++ + ++a + ++b;
		System.out.println(c);
		
		i = i++ - --i + ++i - i--;
		System.out.println(i);
		
//		int o = --(++i);
//		System.out.println(o);
		
		int p = --m * --n * n-- * m--;
		System.out.println(p);
		
		d = d++ + ++d * --d - d--;
		System.out.println(d);
		
		int e = f++ / ++g * g-- / --f;
		System.out.println(e);
		
		int h = --x + y++ - z-- - --z + ++y - --x + y-- - --x;
		System.out.println(h);
		
		
	}
}
