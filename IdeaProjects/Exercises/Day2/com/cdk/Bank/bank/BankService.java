package com.cdk.Bank.bank;

import com.cdk.Bank.account.*;

class BankService extends Account{
	public void getCreditCard() {
		if(getBalance() > 1000) {
			System.out.println("Credit Card can be availed");
		}
	}
	public void lowBalance() {
		if(getBalance() < 200) {
			System.out.println("Low balance ");
		}
	}
}