package com.tka.day21.prog1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Test {
	public static void main(String[] args) throws IOException {
		Product p1 = new Product(11, "Pen", 12);
		Product p2 = new Product(12, "Pencil", 13);
		Product p3 = new Product(13, "NoteBook", 15);		
		ArrayList<Product> a = new ArrayList<Product>();
		a.add(p1);
		a.add(p2);
		a.add(p3);		
		FileOutputStream fos = new FileOutputStream("target.txt");
		ObjectOutputStream ois = new ObjectOutputStream(fos);
		ois.writeObject(a);
		fos.close();
		ois.close();		
	}
}