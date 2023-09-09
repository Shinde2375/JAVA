package com.tka.prac.prog8;

import java.util.Scanner;

class BankAcc {

	String custname;
	String  custid;
	double balance;
	double prevbal;
	
	BankAcc(String custname,String custid)
	{
		this.custname=custname;
		this.custid=custid;
	}
	
	public void deposit(double amount)
	{if(amount!=0)
	{
		balance += amount; 
		prevbal = balance;
	}
	}
	void withdraw(double amt)
	{
		if(amt!=0 && balance>amt)
		{
			balance-=amt;
			prevbal = -amt;
		}
		else if(balance<amt)
		{
			System.out.println("Insufficient balance");
		}
	}
	
	void getprevbal()
	{
		if(prevbal>0)
		{
			System.out.println("Deposit"+prevbal);
		}
		else if(prevbal<0)
		{
			System.out.println("withdraw"+Math.abs(prevbal));
			
		}
		else
		{
			System.out.println("Insuffivient Bal..");
		}
	}
	
	void menu()
	{
		char option;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome"+custname);
		System.out.println("YourID"+custid);
		System.out.println("\n");
		System.out.println("a) check bal");
		System.out.println("b) withdraw");
		System.out.println("c) Deposit");
		System.out.println("d) prev transacition");
		System.out.println("e) Exit");
		
		do
		{
			
			System.out.println("*************");
			System.out.println("Choose an option");
			option= sc.next().charAt(0);
			System.out.println("\n");
			switch(option)
			{
			case 'a':System.out.println("****************");
			System.out.println("Blanace is"+balance);
			System.out.println("****************");
			break;
			
			case 'b':System.out.println("****************");
			System.out.println("Enter Withdraw amount");
			double amt = sc.nextDouble();
			withdraw(amt);
			System.out.println("****************");
			break;
			
			case 'c':System.out.println("****************");
			System.out.println("Enter Deposit amount ");
			double amtD= sc.nextDouble();
			deposit(amtD);
			System.out.println("****************");
			break;
			
			case 'd':System.out.println("****************");
			System.out.println("Previous Transaction is");
			getprevbal();
			System.out.println("****************");
			break;
			
			case 'e':System.out.println("****************");
			break;
			
			}
			
		}while(option!='e');
		System.out.println("Thank you for using our balnservice...");
		
	}
	
	
}
