package com.cdk.Bank.account;

public class Account {
	int accountNumber;
	String name;
	int balance;
	
	protected int getBalance() {
		return this.balance;
	}
	protected void createAccount(int accountNumber, String name, int balance) {
		System.out.println("Account Created: ");
		System.out.println("Account holder's name: " + name);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Account balance: " + balance);
	}
	protected void withdraw(int amount) {
		if (amount < (balance - 100)) {
			System.out.println("Amount can be withdrawn : " + amount);	
		} else {
			System.out.println("Amount can't be withdrawn, low balance : ");	
		}
	}
	protected void deposit(int amount) {
		System.out.println("Total account balance : " + amount);	
	}
	protected void getAccountDetails()
	{
		System.out.println("Account holder's name: " + this.name);
		System.out.println("Account Number: " + this.accountNumber);
		System.out.println("Account balance: " + this.balance);
	}
}