package com.fullstact.entities;

public class SavingAccount extends BankAccount {
	int choice = 0;

	public SavingAccount(String accNumber, String accName, int accBal) {
		// TODO Auto-generated constructor stub
		this.accName = accNumber;
		this.accName = accName;
		this.accBal = accBal;
	}

	void checkBalance(SavingAccount saObj) {
		// TODO Auto-generated method stub
		System.out.println("The main Balance of " + saObj.accName + " account number " + saObj.accNumber + " is " + saObj.accBal);

	}

	@Override
	double deposit(int money) throws InvalidDepositAmount {
		// TODO Auto-generated method stub
		if (money >= 0) {
			accBal += money;
			checkBalance(this);
			return accBal;
		} else {
			throw new InvalidDepositAmount("Please Input right figure to deposit");
		}
	}

	@Override
	double widthdraw(int money) throws InsuffiecientFund {
		// TODO Auto-generated method stub
		if (accBal >= money) {
			accBal -= money;
			checkBalance(this);
			return accBal;

		} else {
			throw new InsuffiecientFund("Sorry you don't have enough Balance to withdraw");
		}
	}

}
