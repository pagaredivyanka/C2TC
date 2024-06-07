package com.tnsif.day13.synchronization;

public class AccountThread extends Thread {
	private Account acc;
	private float amt;
	
	public AccountThread(Account acc, float amt) {
		super();
		this.acc = acc;
		this.amt = amt;
	}
	
	public void run() {
		
//		synchronized  
//		synchronuzed(acc){
		
			acc.withdraw(amt);	
//		}
	}
}
