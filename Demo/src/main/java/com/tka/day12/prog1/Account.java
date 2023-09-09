package com.tka.day12.prog1;

public class Account {

	int id;
	String name;
	private double balance;
	
	
	public double getbalance()
	{
	return balance;
	
	}
	
	public void setbalance(double balance)
	{
		this.balance = balance+this.balance;
	}
	
	
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	public Account(int id, String name, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	
	
}
