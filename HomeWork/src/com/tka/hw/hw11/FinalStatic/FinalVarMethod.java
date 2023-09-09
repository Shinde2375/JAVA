package com.tka.hw.hw11.FinalStatic;

public class FinalVarMethod {

	
	final void JBK()
	{
		final int i=0;
//		for( i=0;i<10;i++)
		{
		System.out.println("Value of i:"+i);
	}
	}
	public static void main(String[] args) {
		FinalVarMethod j = new FinalVarMethod();
		j.JBK();
	}
}