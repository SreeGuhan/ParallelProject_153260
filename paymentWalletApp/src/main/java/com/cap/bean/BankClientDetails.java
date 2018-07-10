package com.cap.bean;

public class BankClientDetails {
	
	private int customerId;
	private String customerName;
	private String emailId;
	private String phoneNo;
	private long balance;
	private String password;
	
	//Getters and setters
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "BankClientDetails [customerId=" + customerId + ", customerName=" + customerName + ", emailId=" + emailId
				+ ", phoneNo=" + phoneNo + ", balance=" + balance + ", password=" + password + "]";
	}
	

}
