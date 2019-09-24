package com.branch;

import util.PhoneNumber;

public class Branch {
	private String id;
	private String branchName;
	private String address;
	private String phNo;
	private Branch(String id, String branchName, String address, String phNo) {
		super();
		this.id = id;
		this.branchName = branchName;
		this.address = address;
		this.phNo = phNo;
	}
	public static Branch createObject(String id, String branchName, String address, String phNo) {
		if(PhoneNumber.checkPh(phNo)) {
			Branch objBranch = new Branch(id, branchName, address, phNo);
			return objBranch;
		}
		else {
			System.out.println("Enter valid ph no");
			return null;
		}
	}
	
	public String getId() {
		return id;
	}
	public String getBranchName() {
		return branchName;
	}
	public String getAddress() {
		return address;
	}
	public String getPhNo() {
		return phNo;
	}
	
}
