package com.tka.prac.prog3;


class demo1 {
	
	int x=10;
	int y = 20;
}

 class demo2 extends demo1{
	
	public void show()
	{
	
		int x =12;
		int y=13;
		
		System.out.println(this.x);
		System.out.println(this.y);
		
		
	}
}

public class demo extends demo2{
	public void data()
	{
		int x=20;
		int y=30;
		
		System.out.println(super.x);
		System.out.println(super.y);
	}
	public static void main(String[] args) {
		
		demo d = new demo();
		d.show();	
		d.data();
	}

}
