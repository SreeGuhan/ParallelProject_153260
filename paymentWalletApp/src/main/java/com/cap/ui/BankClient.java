package com.cap.ui;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cap.bean.BankClientDetails;
import com.capg.service.PaymentService;
import com.capg.service.PaymentValidate;

public class BankClient {

	public static void main(String[] args) {
		
		int balance;
		String name;
		String username;
		String password;
		boolean flag;
		int result=0;
		//String phoneNumber;
		
		PaymentService service= new PaymentService();
		PaymentValidate validate= new PaymentValidate();
		BankClientDetails details= new BankClientDetails();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int ch;
		while (true) {

			System.out.println("MENU");
			System.out.println("1.Create account");
			System.out.println("2.Deposit");
			System.out.println("3.Display balance");
			System.out.println("4.Display transaction details");
			System.out.println("5.Withdraw");
			System.out.println("6.Fund transfer");
			System.out.println("7.Exit");

			System.out.println("Enter your choice:");
			ch = sc.nextInt();

			switch (ch) {

			case 1:// Create account
				

				System.out.println("Enter user name:");
				String customerName=sc.nextLine();
				
				System.out.println("Enter phone number");
				String phoneNo=sc.nextLine();
		
				boolean isValidPhoneNo=validate.validatePhoneNo(phoneNo);
				if(!isValidPhoneNo)
				{
					System.out.println("Incorrect number");
				}
				
				System.out.println("Enter email id");
				String emailId=sc.nextLine();
				
				System.out.println("Enter password(min. len. 8)");
				 password= sc.nextLine();
				
				boolean isValidPassword=validate.validatePassword(password);
				if(!isValidPassword)
				{
					System.out.println("Incorrect password");
				}
				
				String customerId=(int)(Math.random() * 10000)+"";
				List<String> transactions = new ArrayList();
				
				details.setCustomerId(customerId);
				details.setCustomerName(customerName);
				details.setEmailId(emailId);
				details.setPhoneNo(phoneNo);
				details.setPassword(password);
				
				if(isValidPhoneNo && isValidPassword )
				{
					result= service.addAccountDetails(details);
				}
				if (result==1)
				{
					System.out.println("Account created, customer id:"+customerId);
				}
				else
					System.out.println("Account not created");
				
				break;

			
			case 2:// Deposit
				System.out.println("Enter customer id:");
				customerId= sc.nextLine();
				
				System.out.println("Enter password:");
				password= sc.nextLine();
				
				flag=service.showBalance(customerId, password);
				if(flag==false)
				{
					System.out.println("Wrong info.");
				}

				break;

			
			case 3:// Display balance
				System.out.println("Enter customer id:");
				customerId= sc.nextLine();
				
				System.out.println("Enter password:");
				password= sc.nextLine();
				
				System.out.println("Enter amount for deposit:");
				balance=sc.nextInt();
				
				flag=service.deposit(customerId,password,balance);
				if(flag==true)
				{
					System.out.println("Amount deposited");
				}
				else
					System.out.println("Wrong info");
				

				break;

			case 4://withdraw
				System.out.println("Enter customer id:");
				customerId= sc.nextLine();
				
				System.out.println("Enter password:");
				password= sc.nextLine();
				
				System.out.println("Enter amount for withdraw:");
				balance=sc.nextInt();
				
				flag=service.withdraw(customerId,password,balance);
				if(flag==false)
				{
					System.out.println("Wrong info");
				}
				
				break;

			case 5:// transaction details
				System.out.println("Enter customer id:");
				customerId= sc.nextLine();
				
				System.out.println("Enter password:");
				password= sc.nextLine();
				
				flag= service.printTransaction(customerId,password);
				if(flag==false)
					System.out.println("Wrong info");
			
				break;
				
			case 6:// Fund transfer
				System.out.println("Enter password:");
				password= sc.nextLine();
				
				System.out.println("Enter amount for withdraw:");
				balance=sc.nextInt();
				
				System.out.println("Enter the receiver account:");
				String ReceiverAccountNumber= sc.nextLine();
				
				System.out.println("Enter amount you want to transfer");
				balance=sc.nextInt();
				
				if(service.fundTransfer(customerId,password, ReceiverAccountNumber,balance))
				{
					System.out.println("Transfer successful");
				}
				else
					System.out.println("Transfer failure");
				break;

			case 7:
				System.exit(0);
				break;

			default:
				System.out.println("Invalid entry");
				break;

			}

		}
	}

}





