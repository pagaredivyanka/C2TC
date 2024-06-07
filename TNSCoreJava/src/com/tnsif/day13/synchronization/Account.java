package com.tnsif.day13.synchronization;

public class Account implements Bank {
	
	private int accNo;
	private String name;
	private float balance;
	
	public Account() {}
	
	public Account(int accNo, String name, float balance) {
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}
	
	public int getAccNo() {
		return accNo;
	}
	
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public float getBalance() {
		return balance;
	}
	
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	public void deposit(float amt) {
		balance += amt;
	}
	
	@Override
	public synchronized void withdraw(float amt) {
		if ((balance - amt) >= MIN_BALANCE) {
			balance -= amt;
			System.out.println("Withdraw Successfull... ammount : " + amt);
		} else
			System.out.println("Minimum balance reached.. can't withdraw : " + amt);
		
	}
	
	@Override
	public String toString() {
		return "Account [ accNo = " + accNo + ", Name = " + name + ", Balance = " + balance + " ] ";	
	}
}
