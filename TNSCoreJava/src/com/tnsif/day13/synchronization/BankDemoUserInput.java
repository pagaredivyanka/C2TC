package com.tnsif.day13.synchronization;

import java.util.Scanner;
public class BankDemoUserInput {

	public static void main(String[] args) throws InterruptedException {
		
		int accNo;
		String name;
		float balance;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Account no. : " );
		accNo = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter Name no. : ");
		name = sc.nextLine();
		
		System.out.println("Enter Balance: ");
		balance = sc.nextFloat();
//		System.out.println("enter Account No = " + accNo + "Name = " + name + "Balance = " + balance);
		Account a1 = new Account(accNo, name , balance);
		
		
		AccountThread t1 = new AccountThread(a1, 25000);
		AccountThread t2 = new AccountThread(a1, 30000);
		
		System.out.println(a1);
		System.out.println("----------------");
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("----------------");
		System.out.println("final details" + a1);
		
		sc.close();
	}

}
