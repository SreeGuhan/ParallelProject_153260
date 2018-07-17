package com.cap.ui;

import java.io.BufferedReader;
import java.io.IOException;
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
		boolean result = false;
		String customerId = null;
		// String phoneNumber;

		PaymentService service = new PaymentService();
		PaymentValidate validate = new PaymentValidate();
		BankClientDetails details = new BankClientDetails();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int ch;
		while (true) {

			System.out.println("MENU");
			System.out.println("1.Create account");
			System.out.println("2.Deposit");
			System.out.println("3.Display balance");
			System.out.println("4.Withdraw");
			System.out.println("5.Fund Transfer");
			System.out.println("6.Transaction details");
			System.out.println("7.Exit");

			System.out.println("Enter your choice:");
			ch = sc.nextInt();

			switch (ch) {

			case 1:// Create account

				// Create two accounts to demonstrate fund transfer

				System.out.println("**Create two accounts for fund transfer demonstration**");
				String customerName;
				try {
					System.out.println("Enter your name:");
					customerName = br.readLine();
					System.out.println("Enter phone number");
					String phoneNo = br.readLine();

					boolean isValidPhoneNo = validate.validatePhoneNo(phoneNo);

					if (!isValidPhoneNo) {
						System.out.println("Incorrect number-should be of 10 digits");

					}

					System.out.println("Enter gender");
					String gender = br.readLine();

					System.out.println("Enter email id");
					String emailId = br.readLine();

					System.out.println("Enter a user name of your choice");
					username = br.readLine();
					boolean isValidUsername = validate.validateUserName(username);

					if (!isValidUsername) {
						System.out.println("Enter a valid username with min. 3 char.");

					}

					System.out.println("Enter password(min. len. 8)");
					password = br.readLine();

					boolean isValidPassword = validate.validatePassword(password);
					if (!isValidPassword) {
						System.out.println("Enter a strong password");
					}

					customerId = (int) (Math.random() * 10000) + "";
					List<String> transactions = new ArrayList();

					details.setCustomerId(customerId);
					details.setCustomerName(customerName);
					details.setEmailId(emailId);
					details.setPhoneNo(phoneNo);
					details.setPassword(password);
					details.setGender(gender);
					details.setBalance(0);
					details.setUsername(username);
					details.setPassword(password);

					if (isValidPhoneNo && isValidPassword) {
						result = service.addAccountDetails(details);
					}
					if (result == true) {
						System.out.println("Account created, customer id:" + customerId);
					} else
						System.out.println("Account not created");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;

			case 2:// Deposit
				System.out.println("Enter user name:");
				try {
					System.out.println("Enter user name:");
					username = br.readLine();
					System.out.println("Enter password:");
					password = br.readLine();

					PaymentService isvalidLogIn = validate.validateLogIn(username, password);
					flag = service.logIn(customerId, password);
					if (flag==false) {
						System.out.println("Wrong info.");
					}
					System.out.println("Enter amount for deposit:");
					balance = sc.nextInt();

					flag = service.deposit(customerId, password, balance);
					if (flag == true) {
						System.out.println("Amount deposited");
					} else
						System.out.println("Wrong info");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;

			case 3:// Display balance

				try {
					System.out.println("Enter username:");
					username = br.readLine();
					System.out.println("Enter password:");
					password = br.readLine();
					PaymentService isvalidLogIn = validate.validateLogIn(username, password);

					if (isvalidLogIn!=null ) {
						service.showBalance(username, password);
					} else
						System.out.println("Invalid credentials");
					flag= service.showBalance(username, password);
					if(flag==true)
					{
						System.out.println("The balance is:"+service);
					}

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;

			case 4:// withdraw

				try {
					System.out.println("Enter username:");
					username = br.readLine();
					System.out.println("Enter password:");
					password = br.readLine();

					System.out.println("Enter amount for withdraw:");
					balance = sc.nextInt();
					PaymentService isvalidLogIn = validate.validateLogIn(username, password);

					if (isvalidLogIn!=null) {
						service.showBalance(username, password);
					} else
						System.out.println("Invalid credentials");

					if (service.withdraw(username, password, balance)) {
						System.out.println(service);
					} else {
						System.out.println("Insufficient funds");
					}

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;

			case 6:// transaction details

				try {
					System.out.println("Enter username:");
					username = br.readLine();
					System.out.println("Enter password:");
					password = sc.nextLine();

					PaymentService isvalidLogIn = validate.validateLogIn(username, password);

					if (isvalidLogIn!=null) {
						service.printTransaction(username, password);
					} else
						System.out.println("Invalid credentials");

					System.out.println("Enter customerId");
					customerId = br.readLine();

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;

			case 5:// Fund transfer

				try {
					System.out.println("Enter username");
					username = br.readLine();
					System.out.println("Enter password:");
					password = br.readLine();
					PaymentService isvalidLogIn = validate.validateLogIn(username, password);

					if (isvalidLogIn!=null) {
						service.printTransaction(username, password);
					} else
						System.out.println("Invalid credentials");

					System.out.println("Enter amount you want to transfer:");
					int amount = sc.nextInt();

					System.out.println("Enter the receiver account:");
					long account2 = Long.parseLong(br.readLine());

					System.out.println("Enter amount you want to transfer");
					balance = sc.nextInt();

					if (service.fundTransfer(username, password, account2, balance)) {
						System.out.println("Transfer successful");
					} else
						System.out.println("Transfer failure");

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

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
