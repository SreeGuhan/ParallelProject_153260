package com.capg.dao;

import java.util.ArrayList;
import java.util.List;

import com.cap.bean.BankClientDetails;
import com.capg.service.PaymentService;

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
	public boolean logIn(String username, String Password)
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
	public boolean fundTransfer(String customerId, String password, long account2,int balance)
	{
		return flag;
	}
	public boolean printTransaction( String customerId, String password)
	{
		return flag;
	}

	public boolean fundTransfer(String customerId, String password, String receiverAccountNumber, int balance) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean printtransaction(String customerId, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	public static List<PaymentService> getList() {
		// TODO Auto-generated method stub
		return null;
	}

}
