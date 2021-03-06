package com.milan.domain.ioc;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PersonTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPersonWithNotHavingAnyAddress() 
	{
		Person robert = new Person("robert","robert",null);
		assertNotNull(robert);
		assertEquals("robert", robert.getName());
		assertNull(robert.getAddress());
		
	}
	
	
	@Test
	public void testPersonWithAddress() 
	{
		Address home = new Address("33 VENICE BLD", "VENICE", "CA", "90034");
		
		
		Person robert = new Person("robert","robert",home);
		assertNotNull(robert);
		assertEquals("robert", robert.getName());
		assertNotNull(robert.getAddress());
		assertEquals("USA", Address.COUNTRY);
		
	}
	
	




}
