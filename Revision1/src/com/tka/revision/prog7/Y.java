package com.tka.revision.prog7;

class X{
int a;

X()
{
	super();
}

X(int a)
{
	super();
	this.a =a ;
	System.out.println(a);
}
}

 public  class Y extends X
{
	int b;
	Y()
	{
		super();
	}
	Y(int b)
	{
		super();
		this.b=b;
		System.out.println(b);
	}
}
