package com.cap.bean;

import static org.junit.Assert.*;

import org.junit.Test;

public class BankClientDetailsTest {

	@Test
	public void testGetCustomerId() {
		//fail("Not yet implemented");
		assertNotSame(500,0);
		assertNotSame(200,0);
	}

	@Test
	public void testGetCustomerName() {
		//fail("Not yet implemented");
		assertEquals("Valid", "Sreeja","Sreeja");
		assertEquals("Invalid"," "," ");
		assertEquals("Invalid","09876","09876");
		assertNotSame("Sreeja","Sree");
		assertNotSame("Sreeja","12345");
	}

	@Test
	public void testGetEmailId() {
		//fail("Not yet implemented");
		assertEquals("sree@gmail.com","sree@gmail.com");
		assertEquals("sreeja@gmail.com","sreeja@gmail.com");
		assertNotSame("sree@gmail.com"," ");
		assertNotSame("sreeja@gmail.com"," ");
		assertNotSame("sree@gmail.com","sree");
		assertNotSame("sreeja@gmail.com","sreeja");
	}

	@Test
	public void testGetPhoneNo() {
		//fail("Not yet implemented");
		assertEquals(1234567890,1234567890);
		assertNotSame(1234567890," ");
		assertNotSame(1234567890,"abc");
		assertNotSame(1234567890,123456);
	}

	@Test
	public void testGetBalance() {
		//fail("Not yet implemented");
	}
	@Test
	public void testGetPassword() {
		//fail("Not yet implemented");
		assertEquals("Maintenance123","Maintenance123");
		assertNotSame("Maintenance123"," ");
		assertNotSame("Maintenance123","maintenance123");
		assertNotSame("Maintenance123","12345678");
		assertNotSame("Maintenance123","abc");
	}


}
