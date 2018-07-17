package com.capg.service;

import java.util.Map;

import com.capg.bean.AccountDetails;

public interface IPaymentService {
	
	public boolean addCustomer(AccountDetails ad);
	public double showBalance();
	public boolean depositCash(double amount);
	public boolean withdrawCash(double amount);
	public boolean login(String userName, String password);
	public boolean fundTransfer(long receiverAccount,double amount);
	public Map printTransaction();
	

}
