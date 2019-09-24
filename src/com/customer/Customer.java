package com.customer;

import util.PhoneNumber;

public class Customer {
	private String customerName;
	private String customerId;
	private String phoneNumber;
	private String address;
	private String branchNumber;
	private String email;
	private Customer(String customerName, String customerId, String phoneNumber, String address, String branchNumber,
			String email) {
		super();
		this.customerName = customerName;
		this.customerId = customerId;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.branchNumber = branchNumber;
		this.email = email;
	}
	
	public static Customer createObject(String customerName, String customerId, String phoneNumber, String address, String branchNumber,
			String email) {
		if(PhoneNumber.checkPh(phoneNumber)) {
			Customer customer = new Customer(customerName, customerId, phoneNumber, address, branchNumber, email);
			return customer;
		} else {
			return null;
		}
	}
	public String getCustomerName() {
		return customerName;
	}
	public String getCustomerId() {
		return customerId;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public String getBranchNumber() {
		return branchNumber;
	}
	public String getEmail() {
		return email;
	}
	
}
