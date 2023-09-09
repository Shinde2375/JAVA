package com.tka.prac.prog7;

class Test
{
	float a = 55.6f;
	float b = 98.90f;
	
//	float add()
//	{
//		float sum = a+b;
//		return sum;
//		
//	}
	
	float add(float a,float b)
	{
		
		float sum=0;
		sum = this.a + this.b;
		return sum;
	}
}
public class Demo {

	public static void main(String[] args) {
		Test t = new Test();
		float res = t.add(96.45f,786.78f);
		
		System.out.println(res);
		}
}
