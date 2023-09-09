package com.tka.day20.prog1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class Test4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("Source.txt"));
		
		BufferedWriter d = new BufferedWriter(new FileWriter("target.txt"));
		
		String s = null;
		while((s=br.readLine()) !=null)
		{
		d.write(s);
		}
		System.out.println("Data is written in desk");
		br.close();
		d.close();
	}
}
