  package com.tka.day6.prog1;				//date  = 04-07-2023

public class PreNpost {

	void Preinc()
	{
		int x = 5;
		int r =++x+ ++x + ++x;
		
		System.out.println("Value of x= "+x);   //8
		System.out.println("value of r="+r); 	//21
	}
	
	void postinc()
	{
		int x = 5;
		int r =x++ + x++ + x++;
		
		System.out.println("Value of x= "+x);   //8
		System.out.println("value of r="+r); 	//18
	}
	
	void dos()
	{
		int x = 5;
		int r =--x + --x ;
		
		System.out.println("Value of x= "+x);   //3
		System.out.println("value of r="+r);    //7
	}
	
	void dosq()
	{
		int x = 5;
		int r =x++ + ++x ;
				//(5) +(7)
		System.out.println("Value of x= "+x);   //7
		System.out.println("value of r="+r);    //12
	}
	
	void dosa()
	{
		int x = 5;
		int r =x-- - --x ;
		
		System.out.println("Value of x= "+x);   //3
		System.out.println("value of r="+r);   //2
	}
}
