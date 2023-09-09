package com.tka.day13.prog1;					//DATE: 24/7/2023     DAY: MONDAY

public class Test {
	public static void main(String[] args) {
		
		SavingAccount a1 = new SavingAccount(141,"vishal",20000);
		a1.deposit(1000);
		a1.withdraw(50000);
		a1.showBalance();
//		System.out.println(a1.showBalance());
	}
}