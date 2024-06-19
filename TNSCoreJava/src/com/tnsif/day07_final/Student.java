package com.tnsif.day07_final;

public class Student {
	private String uid, name, branch;
	static private String techTrainer = "Alpana", softskillTrainer;
	static final String CollegeName = "PVG, Nashik";
	
	static {
//		techTrainer = "Alpana";
		softskillTrainer = "Divya";
		initializeStaticMembers();
	}
	
	public static void initializeStaticMembers() {
//		this.techTrainer = "ABC";  //This keyword can't be used in static member
		techTrainer = "Alpana Sonje";
		softskillTrainer = "Divya Kalarikal";
//		branch = "Computer"; //non static member can't be accessed in static member
	}

	public static String getSoftskillTrainer() {
		return "Divya K";
	}

	
	public Student() {
		
	}
	

	public Student(String uid, String name, String branch) {
		super();
		this.uid = uid;
		this.name = name;
		this.branch = branch;
	}


	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public static String getTechTrainer() {
		return techTrainer;
	}

	public static void setTechTrainer(String techTrainer) {
		Student.techTrainer = techTrainer;
	}

	public static String getCollegename() {
		return CollegeName;
	}

	public static void setSoftskillTrainer(String softskillTrainer) {
		Student.softskillTrainer = softskillTrainer;
	}

	@Override
	public String toString() {
		return "Student [uid=" + uid + ", name=" + name + ", branch=" + branch + ", Tech Trainer : " + techTrainer + "softskill Trainer : " + softskillTrainer + "College : " + CollegeName + "]\n";
	}

	
	
}
