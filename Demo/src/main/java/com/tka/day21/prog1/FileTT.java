package com.tka.day21.prog1;			//Day:   Date: 29/08/2023

import java.io.File;

public class FileTT {

	public static void main(String[] args) {
		File f = new File("aaa/bbb/ccc");
//		f.mkdirs();
		f.delete();
//		System.out.println("Dir are Created");
		System.out.println("Dir are Deleted");
	}
}