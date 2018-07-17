package com.capg.service;

import java.util.Map;

import com.capg.bean.AccountDetails;
import com.capg.dao.PaymentDao;

public class PaymentService implements IPaymentService{
	
	PaymentDao dao= new PaymentDao();

	public boolean addCustomer(AccountDetails ad) {
		return dao.addCustomer(ad);
	}

	public double showBalance() {
		return dao.showBalance();
	}

	public boolean depositCash(double amount) {
		return dao.depositCash(amount);
	}

	public boolean withdrawCash(double amount) {
		return dao.withdrawCash(amount);
	}

	public boolean login(String userName, String password) {
		return dao.login(userName,password);
	}

	public boolean fundTransfer(long receiverAccount, double amount) {
		return dao.fundTransfer(receiverAccount,amount);
	}

	public Map printTransaction() {
		return dao.printTransaction();
	}

	
}
