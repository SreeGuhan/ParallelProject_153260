package com.capg.dao;



import com.cap.bean.BankClientDetails;



public interface IPaymentDao {

	public boolean addAccountDetails(BankClientDetails details);
	public boolean showBalance(String customerId, String password);
	public boolean deposit(String customerId, String password, int balance);
	public boolean withdraw(String customerId,String password, int balance);
	public boolean fundTransfer(String customerId, String password, String receiverAccountNumber,int balance);
	public boolean printtransaction( String customerId, String password);
}
