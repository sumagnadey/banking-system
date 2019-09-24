package com.branch;

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
		if(checkPh(phNo)) {
			Branch objBranch = new Branch(id, branchName, address, phNo);
			return objBranch;
		}
		else {
			System.out.println("Enter valid ph no");
			return null;
		}
	}
	private static boolean checkPh(String phNo) {
		int phLen = phNo.length();
		for(int i = 0; i < phLen; i++) {
			if(Character.isDigit(phNo.charAt(i))) {
				continue;
			}
			else {
				return false;	
			}
		}
		if(phLen== 10 || phLen == 8) {
			return true;
		}
		else {
			return false;
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
