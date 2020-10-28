package com.training.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.training.example.Calculator;
import com.training.example.ExceedingException;
import com.training.example.NegativeValueException;

class CalculatorTest {
Calculator calculator;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before all testcases");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After all testcases");
	}

	@BeforeEach
	void setUp() throws Exception {
		calculator=new Calculator();
		System.out.println("Before each testcases");
	}

	@AfterEach
	void tearDown() throws Exception {
		calculator=null;
		System.out.println("after each testcases");
	}

	@Test
	void testSum() {
		int actual=calculator.sum(10,20);
		assertEquals(30,actual);
	}
	@Test
	void testNeg() {
		int actual=calculator.sum(-10, -20);
		assertEquals(-30,actual);
	}
	@Test
	void testSub() {
		int actual=calculator.subtraction(10, 20);
		assertEquals(-10,actual);
	}
	@Test
	void testDiv() {
		int actual=calculator.division(10, 2);
		assertEquals(5,actual);
	}
	@Test
	void testAverage() {
		double actual=calculator.average(7, 9, 2);
		assertEquals(6,actual);
	}
	@Test
	void testValueGreater() {
		assertThrows(ExceedingException.class,()->calculator.average(400,6,7));
	}
	@Test
	void testNegative() {
		assertThrows(NegativeValueException.class,()->calculator.average(-4,6,7));
	}
}
