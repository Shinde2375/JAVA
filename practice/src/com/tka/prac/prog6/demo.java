package com.tka.prac.prog6;
class dog
{
	int x=20;
	int y=78;
	public void bark()
	{
		int x=1;
		int y=2;
		//		 System.out.println("Barkinggg");
		System.out.println(this.x);
		System.out.println(this.y);
		System.out.println(x);
		System.out.println(y);

	}
}

class cat extends dog
{
	int x =7;
	int y=6;

	public void meaow()
	{	

		int x= 3;
		int y=4;


		// System.out.println("meaowww...");

		System.out.println(x);
		System.out.println(y);

		System.out.println(this.x);
		System.out.println(this.y);

		System.out.println(super.x);
		System.out.println(super.y);
	}
}
public class demo extends cat{
	int x=5;
	int y=6; 

	public void doing()
	{

		int x=9;
		int y=8;
		//System.out.println("Printingggg");
		System.out.println(x);
		System.out.println(y);

		System.out.println(this.x);
		System.out.println(this.y);



		System.out.println();
	}

	public static void main(String[] args) {
		demo d = new demo();
		dog d1 = new dog();
		
		
		System.out.println(d1.x);
		d.bark();
		d.meaow();
		d.doing();
		System.out.println(((dog)d).x);
		System.out.println(((cat)d).x);
		
		System.out.println(((demo)d).x);
	}



}
