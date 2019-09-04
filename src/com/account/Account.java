package com.account;

public abstract class Account {
	private String customerId;
	private String accountId;
	private double interest;
	
	public Account(String customerId, String accountId, double interest) {
		super();
		this.customerId = customerId;
		this.accountId = accountId;
		this.interest = interest;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	public String getCustomerId() {
		return customerId;
	}

	public String getAccountId() {
		return accountId;
	}
	
}
