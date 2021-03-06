package com.isko.app.domain;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

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
	Set<Student> setOfStudents;

	@Before
	public void setUp() throws Exception 
	{
		
		setOfStudents = new HashSet<Student>();

	}

	
	@Test
	public void testStudentSet() 
	{
		Student robert = new Student("robert","dow",null);
		setOfStudents.add(robert);
		
		System.out.println("robert hashcode"+robert.hashCode());
		
		Student robert1 = new Student("robert","dow",null);
		setOfStudents.add(robert1);
		System.out.println("robert1 hashcode"+robert1.hashCode());

		
		Student robert2 = new Student("robert","dow",null);
		setOfStudents.add(robert2);
		
		System.out.println("robert2 hashcode"+robert2.hashCode());

		
		assertEquals(1, setOfStudents.size());
		
		
		
		
		
	}
	



}
