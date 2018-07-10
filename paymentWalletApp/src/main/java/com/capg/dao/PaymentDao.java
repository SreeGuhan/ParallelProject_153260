package com.capg.dao;

import java.util.ArrayList;
import java.util.List;

import com.cap.bean.BankClientDetails;

public class PaymentDao implements IPaymentDao {
	
	boolean flag=false;
	String sum;
	String sum1;
	List<BankClientDetails> account= new ArrayList<BankClientDetails>();
	public boolean addAccountDetails(BankClientDetails details)
	{
		flag= account.add(details);
		return flag;
	}
	
	public boolean showBalance(String customerId, String password)
	{
		return flag;
	}
	
	public boolean deposit(String customerId, String password, int balance) {
		return flag;
	}
	public boolean withdraw(String customerId,String password, int balance)
	{
		return flag;
	}
	public boolean fundTransfer(String customerId, String password, String receiverAccountNumber,int balance)
	{
		return flag;
	}
	public boolean printtransaction( String customerId, String password)
	{
		return flag;
	}

}
