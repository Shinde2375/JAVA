package com.series.code;
class rect
{
	int l,b;
	rect()
	{
		l=10;
		b=5;
	}
	rect(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	int area()
{
return(l*b);		
}
}
public class rectDemo {
	public static void main(String[] args) {
		rect r1 = new rect();
		System.out.println("Area: "+r1.area());
		rect r2 = new rect(34,22);
		System.out.println("Area: "+r2.area());
	}
}
