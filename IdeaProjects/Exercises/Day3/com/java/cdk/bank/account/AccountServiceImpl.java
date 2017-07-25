package com.java.cdk.bank.account;

public class AccountServiceImpl implements AccountService {
	String name;
	int balance;
	int accountNumber;
	String address;
	long mobile;
	public void open(String name, int balance, int accountNumber, String address,long mobile){
		System.out.println("Account opened :" );
		System.out.println("Name : " + this.name);
		System.out.println("Balance : " + this.balance);
		System.out.println("accountNumber : " + this.accountNumber);
		System.out.println("address : " + this.address);
		System.out.println("mobile : " + this.mobile);	
	}
	public void close(){
		System.out.println("Account closed  by :" + this.name);
	}
	public void withdraw(int withdrawAmount){
		if((balance - withdrawAmount) > 100) {
			System.out.println("Amount withdrawn ");
			this.balance = this.balance - withdrawAmount;
			System.out.println("Current Balance : " + this.balance);
		} else {
			System.out.println("Low balance");
		}
	}
	public void deposit(int deposit){
		System.out.println("Amount deposited, total balance :");
		this.balance = this.balance + deposit; 
	}
	public void balance(){
		System.out.println("Current Balance : " + this.name);
	}
	public String getAddress(){
		return this.address;
	}
	public void setAdress(String address) {
		this.address = address;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public void getDetails() {
		System.out.println("Account Details");
		System.out.println("Name : " + this.name);
		System.out.println("Balance : " + this.balance);
		System.out.println("accountNumber : " + this.accountNumber);
		System.out.println("address : " + this.address);
		System.out.println("mobile : " + this.mobile);
	}
}
