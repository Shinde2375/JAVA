package com.tka.day21.prog1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Reader {
	public static void main(String[] args) throws IOException,ClassNotFoundException{	
		FileInputStream fis = new FileInputStream("targer.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);	
		Object o = ois.readObject();		
		ArrayList<Product> temp = new ArrayList<Product>();
		temp.forEach(t -> System.out.println(t));
	}
}