package com.tka.day20.prog1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {
	public static void main(String[] args) throws IOException {
		String s = "GoodMorningIndia";


		FileOutputStream fos = new FileOutputStream("target.txt");
		fos.write(s.getBytes());
		System.out.println("Data IS Written in target file");
		fos.close();
	}
}

