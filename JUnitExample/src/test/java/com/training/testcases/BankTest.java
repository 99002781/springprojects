package com.training.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.training.example.Bank;
import com.training.example.ExceedingException;
import com.training.example.NegativeValueException;

class BankTest {
Bank bank;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Init");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Destroy");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("before test");
		bank=new Bank(7000);
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("after test");
		bank=null;
	}

	@Test
	void testWithdraw(){
		double actual=bank.withdraw(5000);
		assertEquals(3000,actual);
	}


	@Test
	void testWithdrawExceeding() {
		assertThrows(ExceedingException.class,()->bank.withdraw(4000));
			
	}
	@Test
	void testWithdrawNegative() {
		assertThrows(NegativeValueException.class,()->bank.withdraw(-4000));
		
	}
	@Test
	void testWithdrawEqual() {
		assertThrows(ExceedingException.class,()->bank.withdraw(7000));
	}
	@Test
	void testDeposit() {
		double actual=bank.deposit(2000);
		assertEquals(9000,actual,"should be 9000");
	}
	@Test
	void testDepositNegative() {
		assertThrows(NegativeValueException.class,()->bank.deposit(-4000));
		
	}
	@Test
	void testDepositExceeding() {
		assertThrows(ExceedingException.class,()->bank.deposit(4000));
			
	}
	
}
