package com.cdk.Bank.customer;

import com.cdk.Bank.account.*;

public class CustomerService extends Account {
	public void enquiry() {
		System.out.println("Please dial 100");
	}
	public void createCustomerAccount(int accountNumber, String name, int balance) {
		createAccount(accountNumber, name, balance);
	}
	public void getDetails() {
		getAccountDetails();
	}
	public void withdrawMoney(int amount) {
		System.out.println(amount);
		withdraw(amount);
	}
	public void depositMoney(int amount) {
		deposit(amount);
	}
}
