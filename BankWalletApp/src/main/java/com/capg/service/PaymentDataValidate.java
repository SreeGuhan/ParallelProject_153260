package com.capg.service;

import java.util.regex.Pattern;

import com.capg.bean.AccountDetails;

import java.util.HashMap;
import java.util.regex.Matcher;

public class PaymentDataValidate {
	
	static AccountDetails ad;
	static HashMap<String, AccountDetails> map= new HashMap<String, AccountDetails>();
	private Pattern pattern;
	private Matcher matcher;
	public boolean validatePhoneNo(String phoneNo)
	{
		if(phoneNo.length()==10)
			return true;
		else
			return false;
	}
	
	public boolean validateBalance(double balance)
	{
		if(balance>=500)
			return true;
		else
			return false;
	}
	public boolean validateUserName(String userName)
	{
		String name_pattern= "^[A-Za-z0-9._-] {3,25}$";
		this.pattern=Pattern.compile(name_pattern);
		matcher=pattern.matcher(userName);
		return matcher.matches();
	}
	public boolean validatePassword(String password)
	{
		if(password.length()>=8)
			return true;
		else return false;
	}
    public boolean validateGender(String gender)
    {
    	if(gender.equals("male")||gender.equals("female")||gender.equals("m")||gender.equals("f"))
        return true;
    	else
    		return false;
    }
    public boolean login(String userName, String password) {
		for(String key: map.keySet())
		{
			AccountDetails login= map.get(key);
			if((login.getConsumerDetails().getUserName().equals(userName)) && (login.getConsumerDetails().getPassword().equals(password)))
			{
				ad=login;
				return true;
			}
		}
		return false;
	}
}
