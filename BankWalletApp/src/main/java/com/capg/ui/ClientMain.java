package com.capg.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.capg.bean.AccountDetails;
import com.capg.bean.ConsumerDetails;
import com.capg.service.PaymentDataValidate;
import com.capg.service.PaymentService;

public class ClientMain {
	static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
public static void main(String[] args) {
		
		
		int ch1,ch2;
		while(true)
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("***MENU***");
			System.out.println("1. Login");
			System.out.println("2. Create an account");
			
			System.out.println("Enter your choice:");
			ch1= sc.nextInt();
			
			switch(ch1)
			{
			case 1:
				boolean login= login();
				if(login)
				{
					while(true)
					{
						System.out.println("**FACILITIES**");
						System.out.println("1. Show balance");
						System.out.println("2. Deposit cash");
						System.out.println("3. Withdraw cash");
						System.out.println("4. Fund transfer");
						System.out.println("5. Print transaction");
						System.out.println("6. EXIT");
						
						System.out.println("Enter your choice:");
						ch2=sc.nextInt();
						
						switch(ch2)
						{
						case 1:
							showBalance();
							break;
							
						case 2:
							depositCash();
							break;
							
						case 3:
							withdrawCash();
							break;
							
						case 4:
							fundTransfer();
							break;
							
						case 5:
							printTransaction();
							break;
							
						case 6:
							System.exit(0);
							break;
							
							default: System.out.println("Enter a valid choice!");
						}
					}
				}
				else
					System.out.println("Enter the correct credentials!");
				break;
				
			case 2:
				createAccount();
				break;
			}
		}
		
		

	}


private static void withdrawCash() {
		// TODO Auto-generated method stub
	  PaymentService  service= new PaymentService();
	System.out.println("Enter withdraw amount:");
	double amount;
	try {
		amount = Double.parseDouble(br.readLine());
		boolean withdraw= service.withdrawCash(amount);
		if(withdraw)
		{
			System.out.println("Amount withdrawn");
		}
		else System.out.println("Invalid credentials");
	} catch (NumberFormatException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		
	}


private static void depositCash() {
		// TODO Auto-generated method stub
	  PaymentService  service= new PaymentService();
	System.out.println("Enter deposit amount:");
	double amount;
	try {
		amount = Double.parseDouble(br.readLine());
		boolean deposit=service.depositCash(amount);
		
		if(deposit)
		{
			System.out.println("Deposit done");
		}
		else System.out.println("Invalid credentials");
			
	} catch (NumberFormatException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}


private static boolean login()
{
	  PaymentService  service= new PaymentService();
	
	try {
		System.out.println("Enter user name:");
		String userName= br.readLine();
		System.out.println("Enter password:");
		String password= br.readLine();
		
		boolean b= service.login(userName,password);
		
		if(b)
		{
			return true;
		}
		else return false;
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return false;
	}
	
	private static void printTransaction()
	{
		  PaymentService  service= new PaymentService();
		
		System.out.println(service.printTransaction());
	}
	
	private static void fundTransfer()
	{
		  PaymentService  service= new PaymentService();
		
		try {
			System.out.println("Enter the receiver account number:");
			long receiverAccount=Long.parseLong(br.readLine());
			System.out.println("Enter amount for transfer:");
			double amount= Double.parseDouble(br.readLine());
			boolean transfer= service.fundTransfer(receiverAccount,amount);
			if(transfer)
			{
				System.out.println("Fund transfer successful");
			}
			else System.out.println("Fund transfer failed");
		}
			
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
}

	
	private static void createAccount() {
		// TODO Auto-generated method stub
		 ConsumerDetails cd= new ConsumerDetails();
		 AccountDetails ad= new AccountDetails();
	    PaymentDataValidate validate= new PaymentDataValidate();
	    PaymentService  service= new PaymentService();
	    
	    
		System.out.println("Enter your name:");
		String consumerName;
		try {
			consumerName = br.readLine();
			System.out.println("Enter a unique username:");
			String userName= br.readLine();
			System.out.println("Enter password(min. 8 char):");
			String password= br.readLine();
			System.out.println("Enter age:");
			int age= Integer.parseInt(br.readLine());
			System.out.println("Enter gender:");
			String gender= br.readLine();
			System.out.println("Enter email id:");
			String emailId=br.readLine();
			System.out.println("Enter phone number:");
			String phoneNo=br.readLine();
			System.out.println("Enter inital balance:");
			double balance= Double.parseDouble(br.readLine());
			
			long transactionId=(long) (Math.random() * 10000 + 99999);
			long senderAccount=(long) (Math.random() * 10000 + 99999);
			long receiverAccount=(long) (Math.random() * 10000 + 99999);
			
			boolean isvalidatePhoneNo= validate.validatePhoneNo(phoneNo);
			boolean isvalidateBalance= validate.validateBalance(balance);
			boolean isvalidateUserName=validate.validateUserName(userName);
			boolean isvalidatePassword=validate.validatePassword(password);
			boolean isvalidateGender= validate.validateGender(gender);
			
			if(isvalidatePhoneNo && isvalidateBalance) {
				
				cd.setAge(age);
				cd.setConsumerName(consumerName);
				
				cd.setEmailId(emailId);
				cd.setGender(gender);
				cd.setPhoneNo(phoneNo);
				
				ad.setConsumerDetails(cd);
				ad.setUserName(userName);
				ad.setPassword(password);
				ad.setBalance(balance);
				ad.setTransactionId(transactionId);
				ad.setSenderAccount(senderAccount);
				ad.setReceiverAccount(receiverAccount);
				
				boolean b=service.addCustomer(ad);
				if(b)
				{
					System.out.println("Account created. Account no.:"+senderAccount);
				}
				else
					System.out.println("Account not created");
			}
			else {
				System.out.println("Enter correct details");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}


	private static void showBalance() {
		// TODO Auto-generated method stub
		// AccountDetails ad= new AccountDetails();
	    PaymentService  service= new PaymentService();
		double details= service.showBalance();
		System.out.println(details);
		
	}
}
