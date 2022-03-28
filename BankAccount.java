package com.fullstact.entities;

public abstract class BankAccount {
	String accName;
	String accNumber;
	double accBal;

	

	abstract double deposit(int money) throws InvalidDepositAmount;

	abstract double widthdraw(int money) throws InsuffiecientFund;

}
