package com.tnsif.PracticeAssignments.a1_BankTransaction;

public abstract class Account {
	abstract void deposit(double amount);
	abstract void withdraw(double amount);
	abstract double getBalance();
}
