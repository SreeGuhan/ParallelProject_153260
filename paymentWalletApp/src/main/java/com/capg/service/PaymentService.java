package com.capg.service;

import com.cap.bean.BankClientDetails;

public class PaymentService implements IPaymentService{

	PaymentService service= new PaymentService();
	
	public boolean addAccountDetails(BankClientDetails details)
	{
		return service.addAccountDetails(details);
	}
	public boolean showBalance(String customerId, String password)
	{
		return service.showBalance(customerId,password);
	}
	public boolean deposit(String customerId, String password, int balance)
	{
		return service.showBalance(customerId,password);
	}
	public boolean withdraw(String customerId,String password, int balance)
	{
		return service.withdraw(customerId,password,balance);
	}
	public boolean fundTransfer(String customerId, String password, String receiverAccountNumber,int balance)
	{
		return service.fundTransfer(customerId, password, receiverAccountNumber,balance);
	}
	public boolean printTransaction( String customerId, String password)
	{
		return service.printTransaction(customerId,password);
	}
	public boolean printtransaction(String customerId, String password) {
		// TODO Auto-generated method stub
		return false;
	}

}
	
