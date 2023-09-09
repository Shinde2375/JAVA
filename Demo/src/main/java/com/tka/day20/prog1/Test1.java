package com.tka.day20.prog1;					//DAY: MONDAY , DATE : 28/8/2023

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("Source.txt");
		byte b[]=fis.readAllBytes();
		FileOutputStream fos = new FileOutputStream("target.txt");
		fos.write(b);
		System.out.println("Data IS Written in target file");
		fis.close();
		fos.close();
	}
	
}