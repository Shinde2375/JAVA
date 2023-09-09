package com.tka.day13.prog1;

public class Account {
int id;
String name;
double bal;
@Override
public String toString() {
	return "Account [id=" + id + ", name=" + name + ", bal=" + bal + "]";
}
public Account(int id, String name, double bal) {
	super();
	this.id = id;
	this.name = name;
	this.bal = bal;
}


void withdraw(double amount)
{
	bal = bal-amount;
}

void deposit(double amount)
{
	bal = bal+amount;
}

void showBalance()
{
	System.out.println(bal+"");
}
}
