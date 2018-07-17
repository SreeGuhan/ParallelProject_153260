package com.cap.bean;

public class BankClientDetails {
	
	private String customerId;
	private String customerName;
	private String emailId;
	private String phoneNo;
	private double balance;
	private String password;
	private String username;
	private String gender;
	private long account1;
	private long account2;
	private double amount;
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
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
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getAccount1() {
		return account1;
	}
	public void setAccount1(long account1) {
		this.account1 = account1;
	}
	public long getAccount2() {
		return account2;
	}
	public void setAccount2(long account2) {
		this.account2 = account2;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "BankClientDetails [customerId=" + customerId + ", customerName=" + customerName + ", emailId=" + emailId
				+ ", phoneNo=" + phoneNo + ", balance=" + balance + ", password=" + password + ", username=" + username
				+ ", gender=" + gender + ", account1=" + account1 + ", account2=" + account2 + ", amount=" + amount
				+ "]";
	}
	
	
	
}
