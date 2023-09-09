package com.tka.day16.prog1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test3 {

	public static void main(String[] args) {
		int a=10;
		int b=5;
		int r= a/b;
		System.out.println(r);
		
		String s =null;
//		System.out.println(s.toLowerCase());
		
		int arr[]= {7,2,99,77,5,6,47};
		try {
		System.out.println(arr[10]);
		}
		catch(IndexOutOfBoundsException e)
		{
		System.out.println("Continue..");	
		}
		
		try
		{
			Class.forName("com.tka.day16.prog1.X");
		}
		catch(ClassNotFoundException  e)
		{
			e.printStackTrace();
		}
		
		try
		{
			File f = new File("target.txt");
			FileOutputStream fos = new FileOutputStream(f);
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}
