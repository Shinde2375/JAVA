package com.tka.day20.prog1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test3 {
	public static void main(String[] args) throws IOException {
		File file = new File("Source.txt");
		FileInputStream fis = new FileInputStream(file);
		byte[]data = new byte[(int)file.length()];
		fis.read(data);
		FileOutputStream fos = new FileOutputStream("target.txt");
		fos.write(data);
		
		fis.close();
		fos.close();
		System.out.println("Data is Written n");
	}
}