package com.fullstact.entities;

public class MainMethod extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount saObj = new SavingAccount("A3123", "jay", 0);
		saObj.checkBalance(saObj);
		try {
			saObj.deposit(10000);
		} catch (InvalidDepositAmount e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("**********  Thank You for The Visit...STAY SAFE!!!  ************");
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			saObj.widthdraw(5000);
		} catch (InsuffiecientFund e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("**********  Thank You for The Visit...STAY SAFE!!!  ************");
		}

	}

}
