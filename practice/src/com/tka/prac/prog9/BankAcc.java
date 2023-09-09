package com.tka.prac.prog9;

import java.util.Scanner;

public class BankAcc {

	String custname;
	String custid;
	double bal;
	double prevtran;
	
	
	public BankAcc(String custname,String custid)
	{
		this.custname=custname;
		this.custid = custid;
		
	}
	public void deposit(double amt)
	{
		if(amt!=0)
		{
			bal +=amt;
			prevtran = bal;
		}
	}
	 void withdraw(double amot)
	{
		if(amot!=0 && bal>amot)
		{
			bal -= amot;
			prevtran = -amot;
		}
		else if(bal<amot)
		{
			System.out.println("Insufficient Bal");
		}
	}
	
	void getprevtran() {
		if(prevtran>0)
		{System.out.println("Deposit"+prevtran);
	}
		else if(prevtran<0)
		{
			System.out.println("Withdraw"+Math.abs(prevtran));
		}
		else
		{
			System.out.println("Insufficient bal...");
		}
}
	
	void main()
	{
		Scanner sc = new Scanner(System.in);
		char option;
		
		System.out.println("Welcome :"+custname);
		System.out.println("Your id :"+custid);
		System.out.println("\n");
		
		System.out.println("a) Deposit");
		System.out.println("b) Withdraw");
		System.out.println("c) balance");
		System.out.println("d) prevtransaction");
		System.out.println("e) Exit");
		
		
		
		
		do
		{
			System.out.println("Choose an option");
			option  = sc.next().charAt(0);
			System.out.println("\n");
			switch(option)
			{
			case 'a':
				System.out.println("*********");
				System.out.println("Enter amount for deposit:");
				double amt =sc.nextDouble();
				deposit(amt);
				System.out.println("*********");
				break;
				
			case 'b':
				System.out.println("*********");
				System.out.println("Enter amount for Withdraw:");
				double wit =sc.nextDouble();
				withdraw(wit);
				System.out.println("*********");
				break;

				
			case 'c':
				System.out.println("*********");
				System.out.println("Balance is:"+bal);
				//double b =sc.nextDouble();
				
				System.out.println("*********");
				break;

				
				
			case 'd':
				System.out.println("*********");
				System.out.println("Previous Transaction are:");
				//double amt =sc.nextDouble();
				getprevtran();
				System.out.println("*********");
				break;

				
				
			case 'e':
				System.out.println("*********");
				break;

				
			
			default :
			
				System.out.println("Enter Valid Options...");
			
			break;

			}
		}
		while(option!='e');
		{System.out.println("Thank you for using our Bank Application..");
		
	}
	}
	
}
