package com.tnsif.day08_interface;

import javax.management.remote.SubjectDelegationPermission;
public interface OuterInterface {
	
	int N = 10;
	
	interface InnerInterface {
		
		int N = 20;
		void display();
	}
	
	void show();
}
