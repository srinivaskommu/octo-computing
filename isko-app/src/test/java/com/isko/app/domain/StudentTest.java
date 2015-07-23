package com.isko.app.domain;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StudentTest 
{
	Student john;
	Student chris;
	
	Integer subjectMarks;
	boolean passOrFail;
	Boolean isStudentPass;

	@Before
	public void setUp() throws Exception 
	{
		john = Student.getInstance("john", "moody");
		chris = Student.getInstance("chris", "robert");

	}

	@Test
	public void testGetFirstName() 
	{
		assertNotNull(john);
		assertEquals("john", john.getFirstName());
		assertEquals("moody", john.getLastName());
		assertEquals("UTD", Student.schoolName);
		
		
		assertEquals(false, passOrFail);
		assertEquals(null, isStudentPass);
		
	}



}