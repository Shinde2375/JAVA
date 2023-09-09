package com.tka.day13.prog1;

public class SavingAccount extends Account{
	
	float intrate;
	public SavingAccount(int id,String name,double bal)
	{
		super(id,name,bal);
	}
	
	double calcIntrest(int n)
	{
		double ans = bal*n*intrate;
		return ans;
		
	}
	
	void withdraw(double amount)
	{
		if(bal-amount>=500)
		bal = bal-amount;
		else
			System.out.println("Insufficient balance in account");
	}
	
	
}
