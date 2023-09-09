package com.tka.day22.prog1;			// in this prog we run prog/loop without creatin g an object. by using Thread
public class Test2 {
	public static void main(String[] args){		
		new Thread(() -> {						// -> - this is an lambda Expression
		for(int i=1;i<=10;i++)
			System.out.println(i);
			}).start();
	}
}