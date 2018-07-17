package com.capg.dao;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.capg.bean.AccountDetails;
import com.capg.bean.ConsumerDetails;

public class PaymentDao implements IPaymentDao{
	
	
	static HashMap<String, AccountDetails> map= new HashMap<String, AccountDetails>();
	
	static HashMap<String, Double> transaction= new HashMap<String, Double>();

	static AccountDetails temp=new AccountDetails();
	
	public boolean addCustomer(AccountDetails ad) {
		map.put(ad.getConsumerDetails().getUserName(), ad);
		return true;
	}

	public double showBalance() {
	//AccountDetails ad= new AccountDetails();
		for (String key : map.keySet()) {
			
			AccountDetails login1= map.get(key);
			if(temp.getUserName().equals(login1.getUserName())) {
				
				return login1.getBalance();
			}
			
		}
		return -1;
	}

	public boolean depositCash(double amount) {
	 //AccountDetails ad= new AccountDetails();
		
			for (String key : map.keySet()) {
			
			AccountDetails login1= map.get(key);
			if(temp.getUserName().equals(login1.getUserName())) {
				
				login1.setBalance(login1.getBalance()+amount);
				long tid= (long) (Math.random() * 10000 + 99999);
				String s="Transaction id:"+Long.toString(tid)+" Balanace: "+Double.toString(login1.getBalance());
				transaction.put(s, amount);
				return true ;
			}
			
		}
		
		return false;
		/*
		temp.setBalance(temp.getAmount()+amount);
		System.out.println("Balance"+temp.getBalance());
		long tid= (long) (Math.random() * 10000 + 99999);
		String s="Transaction id:"+Long.toString(tid);
		transaction.put(s,amount);
		return true;*/
	}

	public boolean withdrawCash(double amount) {
		 //AccountDetails ad= new AccountDetails();
for (String key : map.keySet()) {
			
			AccountDetails login1= map.get(key);
			if(temp.getUserName().equals(login1.getUserName())) {
				
				login1.setBalance(login1.getBalance()-amount);
				long tid= (long) (Math.random() * 10000 + 99999);
				String s="Transaction id:"+Long.toString(tid)+" Balanace: "+Double.toString(login1.getBalance());
				transaction.put(s, amount);
				return true ;
			}
			
		}
		
		return false;
	/*if(temp.getBalance() >= (amount+500))
	{
		temp.setBalance(temp.getBalance()-amount);
		System.out.println("Amount Withdrawn:"+temp.getBalance());
		long tid= (long) (Math.random() * 10000 + 99999);
		String s="Transaction id:"+Long.toString(tid);
		transaction.put(s,amount);
		return true;
	}
	else System.out.println("Insufficient funds");
	return false;*/
	}

	
	public boolean login(String userName, String password) {
	//	AccountDetails ad= new AccountDetails();
		for(String key: map.keySet())
		{
			AccountDetails login1= map.get(key);
			if((login1.getUserName().equals(userName)) && 
					(login1.getPassword().equals(password)))
			{
				temp=login1;
				return true;
			}
		}
		return false;
	}

	public boolean fundTransfer(long receiverAccount, double amount) {
		// AccountDetails ad= new AccountDetails();
		
		for(String key:map.keySet())
		{
			AccountDetails details= map.get(key);
			//AccountDetails details1= map.get(key);
			
			if(details.getReceiverAccount() == receiverAccount)
			{
				//details.setBalance(details.getBalance()+amount);
				details.setBalance(details.getBalance()-amount);
				long tid= (long) (Math.random() * 10000 + 99999);
				String s="Transaction id:"+Long.toString(tid);
				transaction.put(s,amount);
				return true;
			}
			else
			{
				temp.setBalance(details.getBalance()-amount);
				return true;
			}
		}
		return false;
	}

	public  Map printTransaction() {
		return transaction;
	}

	
	
	

}
