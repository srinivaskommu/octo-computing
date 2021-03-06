package com.isko.app.domain;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class MapExampleTest 
{
	
	Map<String,Integer> cityStudentsMap;

	@Before
	public void setUp() throws Exception 
	{
		cityStudentsMap = new HashMap<String, Integer>();
		cityStudentsMap.put("NEW YORK", 1000);
		cityStudentsMap.put("LOS ANGELES", 10);
		cityStudentsMap.put("DALLAS", 1);
		
	}

	@Test
	public void check() 
	{
		assertEquals(3, cityStudentsMap.size());
		
		cityStudentsMap.put("DALLAS", 20);
		
		Integer expected = 20;
		assertEquals(expected,cityStudentsMap.get("DALLAS"));
		
	}
	
	
	



}
