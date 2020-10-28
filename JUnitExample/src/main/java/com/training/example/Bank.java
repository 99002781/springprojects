package com.training.example;

public class Bank {
	double balance;

	public Bank(double balance) {
		super();
		this.balance = balance;
	}
	public double withdraw(double amount) throws ExceedingException{
		if(amount>=4000||amount==balance) {
			throw new ExceedingException("amount beyond limit");
		}
		if(amount<=0) {
			throw new NegativeValueException("amount is less than 0");
		}
		
		 balance=balance-amount;
		 return balance;
	}
	public double deposit(double amount) {
		if(amount>=4000||amount==balance) {
			throw new ExceedingException("amount beyond limit");
		}
		if(amount<=0) {
			throw new NegativeValueException("amount is less than 0");
		}
		balance=balance+amount;
		 return balance;
	}
	
}
