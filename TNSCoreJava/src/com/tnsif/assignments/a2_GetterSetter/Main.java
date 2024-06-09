package com.tnsif.assignments.a2_GetterSetter;

import java.util.*;
public class Main {
	public static void main(String[] args) {
		int selector;
		int hours;
		double costPerHour;
		
		//using getter and setter method
		Scanner sc = new Scanner(System.in);
		AirIndia AI = new AirIndia();
		KingFisher KF = new KingFisher();
		Indigo IND = new Indigo();
		
		System.out.println("Select from following : \n1 Air India \n2 KingFisher \n3 Indigo \n\n Enter (1/2/3): \n");
		selector = sc.nextInt();
		
		System.out.println("Enter Hours : ");
		hours = sc.nextInt();
		
		System.out.println("Enter Cost per Hour : ");
		costPerHour = sc.nextDouble();
		
		switch(selector){
		
		case 1:
			AI.setHours(hours);
			AI.setCostPerHour(costPerHour);
			System.out.printf("\n Flight Fare : %.2f", AI.calculateAmount());
			break;
			
		case 2:
			KF.setHours(hours);
			KF.setCostPerHour(costPerHour);
			System.out.printf("\n Flight Fare : %.2f", KF.calculateAmount());
			break;
			
		case 3:
			IND.setHours(hours);
			IND.setCostPerHour(costPerHour);
			System.out.printf("\n Flight Fare : %.2f", IND.calculateAmount());
			break;
			
		default: 
			System.out.println("Wrong Choice..!");
			break;
		}
	}
}
