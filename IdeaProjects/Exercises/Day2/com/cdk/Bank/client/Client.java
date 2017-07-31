package com.cdk.Bank.client;

import com.cdk.Bank.account.*;
import com.cdk.Bank.customer.CustomerService;
import com.cdk.Bank.bank.*;

class Client {
	public static void main(String []args) {
		CustomerService customerService = new CustomerService();
		customerService.createCustomerAccount(111,"Ram",3000); 
		customerService.depositMoney(10000);
		customerService.getDetails();
		customerService.enquiry();
	}
}