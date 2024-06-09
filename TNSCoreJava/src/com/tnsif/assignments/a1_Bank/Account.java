package com.tnsif.assignments.a1_Bank;

public abstract class Account {
	abstract void deposit(double amount);
	abstract void withdraw(double amount);
	abstract double getBalance();
}
