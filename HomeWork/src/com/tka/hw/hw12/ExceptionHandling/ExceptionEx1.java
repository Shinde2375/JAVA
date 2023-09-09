package com.tka.hw.hw12.ExceptionHandling;

public class ExceptionEx1 {

	public static void main(String[] args) {
		int arr[] = {1,2};
		try {
			System.out.println("the 10th value of Array is:"+arr[10]);
		}
		catch (Exception e) {
			System.out.println("error is:"+e);		}
	}
}