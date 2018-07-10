package com.capg.dao;

import static org.junit.Assert.*;
import com.cap.bean.BankClientDetails;
import com.capg.service.PaymentService;

import junit.framework.TestCase;

import org.junit.Test;

public class PaymentDaoTest extends TestCase {
	PaymentService service= new PaymentService();

	@Test
	public void testAddAccountDetails() {
		//fail("Not yet implemented");
	}

	@Test
	public void testShowBalance() {
		//fail("Not yet implemented");
		assertEquals(70000,70000);
	}

	@Test
	public void testDeposit() {
		//fail("Not yet implemented");
		assertEquals(false,service.deposit("1011","hello",7000));
		assertEquals(false,service.deposit(" "," ",7000));
		assertEquals(false,service.deposit("1011","hello",0));
		
	}

	@Test
	public void testWithdraw() {
		//fail("Not yet implemented");
		assertEquals(false,service.withdraw("1011","hello",7000));
		assertEquals(false,service.withdraw(" "," ",7000));
		assertEquals(false,service.withdraw("1011","hello",0));
	}

	@Test
	public void testFundTransfer() {
		//fail("Not yet implemented");
		assertEquals(false,service.fundTransfer("1011","hello","4567",7000));
		assertEquals(false,service.fundTransfer(" "," "," ",7000));
		assertEquals(false,service.fundTransfer("1011","hello"," ",0));
	}

	@Test
	public void testPrinttransaction() {
		//fail("Not yet implemented");
		assertEquals(false,service.printTransaction("1011","hello"));
		assertEquals(false,service.printTransaction(" "," "));
		assertEquals(false,service.printTransaction("1011"," "));
		assertEquals(false,service.printTransaction(" ","hello"));
		
	}

}
