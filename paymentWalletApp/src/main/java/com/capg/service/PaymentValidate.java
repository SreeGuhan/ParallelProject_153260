package com.capg.service;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capg.dao.PaymentDao;


public class PaymentValidate {
	
	private Pattern pattern;
	private Matcher matcher;
	public boolean validateUserName(String username)
	{
		return false;
	}
	public boolean validatePassword(String password)
	{
		return false;
		
	}
	
	public boolean validatePhoneNo(String phoneNo)
	{
		if(phoneNo.length()==10)
        return true;
		else return false;
	}
	
	public boolean validateBalance(long balance)
	{
		return false;
	}
	
	
	public PaymentService validateLogIn(String username, String password)
	{
		List<PaymentService> list= PaymentDao.getList();
		for(PaymentService service: list) {
			if(service.getUsername().equalsIgnoreCase(username) && service.getPassword().equals(password))
			{
				return service;
			}
		}
		return null;
	}

}
