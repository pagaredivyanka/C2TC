package com.tnsif.day13.synchronization;

//import java.util.Scanner;
public class BankDemo {

	public static void main(String[] args) throws InterruptedException {
		
//		Scanner a1 = new Scanner(System.in);
//		
//		System.out.println("enter Account No = " + accNo + "Name = " + name + "Balance = " + balance);
		Account a1 = new Account(1110,"Divyanka",45000);
		
		
		AccountThread t1 = new AccountThread(a1, 25000);
		AccountThread t2 = new AccountThread(a1, 30000);
		
		System.out.println(a1);
		System.out.println("----------------");
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("----------------");
		System.out.println(a1);
	}

}
