package com.java.cdk.bank.main;

import com.java.cdk.bank.customerService.CustomerServiceImpl;
import com.java.cdk.bank.accountService.AccountServiceImpl;

class Bank {
	public static void main(String [] args) {
		AccountServiceImpl account = new AccountServiceImpl();
		account.open("Mohan", 1230000, 11, "12,Park street,pune", 98909390);
		account.withdraw(2000);
		account.deposit(4000);
		account.deposit(1000);
		account.balance();
		account.deposit(550);
		account.withdraw(2000);
		account.balance();
		
		CustomerServiceImpl customer = new AccountServiceImpl();
		customer.details();
		customer.updateAddress("32,Baner,pune");
		customer.updateMobile(789001239);
		
		account.balance();
		account.close();
	}
}
