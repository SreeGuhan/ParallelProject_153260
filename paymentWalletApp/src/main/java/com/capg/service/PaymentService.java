package com.capg.service;

import com.cap.bean.BankClientDetails;
import com.cap.ui.BankClient;
import com.capg.dao.PaymentDao;

public class PaymentService implements IPaymentService{

	PaymentDao dao= new PaymentDao();
	
	public boolean addAccountDetails(BankClientDetails details)
	{
		return dao.addAccountDetails(details);
	}
	public boolean logIn(String username, String Password)
	{
		return dao.logIn(username, Password);
	}
	public boolean showBalance(String customerId, String password)
	{
		return dao.showBalance(customerId,password);
	}
	public boolean deposit(String customerId, String password, int balance)
	{
		return dao.showBalance(customerId,password);
	}
	public boolean withdraw(String customerId,String password, int balance)
	{
		return dao.withdraw(customerId,password,balance);
	}
	public boolean fundTransfer(String customerId, String password, long account2,int balance)
	{
		return dao.fundTransfer(customerId, password, account2,balance);
	}
	public boolean printTransaction( String customerId, String password)
	{
		return dao.printTransaction(customerId,password);
	}
	public boolean printtransaction(String customerId, String password) {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean fundTransfer(String customerId, String password, String receiverAccountNumber, int balance) {
		// TODO Auto-generated method stub
		return false;
	}
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getPassword() {
		// TODO Auto-generated method stub
		return null;
	}
	
	}


	
