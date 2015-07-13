package com.isko.app.domain;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StudentTest 
{
	Student john;

	@Before
	public void setUp() throws Exception 
	{
		john = new Student("john", "moody");

	}

	@After
	public void tearDown() throws Exception 
	{


	}

	@Test
	public void testGetFirstName() 
	{
		assertNotNull(john);
		assertEquals("john", john.getFirstName());
		assertEquals("moody", john.getLastName());
	}



}
