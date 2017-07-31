package com.java.cdk.bank.account;

interface AccountService {
	void open(String name, int balance, int accountNumber, String address,long mobile);
	void close();
	void withdraw(int withdraw);
	void deposit(int deposit);
	void balance();
}
