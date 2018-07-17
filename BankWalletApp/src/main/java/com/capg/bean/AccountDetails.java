package com.capg.bean;

public class AccountDetails {
	
	private String userName;
	private String password;
	private long transactionId;
	private long senderAccount;
	private long receiverAccount;
	private double balance;
	private double amount;
	private ConsumerDetails consumerDetails;
	
	
	public ConsumerDetails getConsumerDetails() {
		return consumerDetails;
	}
	public void setConsumerDetails(ConsumerDetails consumerDetails) {
		this.consumerDetails = consumerDetails;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}
	public long getSenderAccount() {
		return senderAccount;
	}
	public void setSenderAccount(long senderAccount) {
		this.senderAccount = senderAccount;
	}
	public long getReceiverAccount() {
		return receiverAccount;
	}
	public void setReceiverAccount(long receiverAccount) {
		this.receiverAccount = receiverAccount;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "AccountDetails [userName=" + userName + ", password=" + password + ", transactionId=" + transactionId
				+ ", senderAccount=" + senderAccount + ", receiverAccount=" + receiverAccount + ", balance=" + balance
				+ ", amount=" + amount + "]";
	}
	
	

}
