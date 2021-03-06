package com.milan.sym.service;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.milan.domain.ioc.Address;
import com.milan.sym.domain.Customer;
import com.milan.sym.domain.CustomerDAO;
import com.milan.sym.domain.CustomerDaoJDBCImpl;
import com.milan.sym.domain.Visit;
import com.milan.sym.util.MilanDataBaseException;

public class CustomerServiceTest 
{
	CustomerService service;
	

	Customer robert;

	ApplicationContext ctx;
	
	@Before
	public void setUp()
	{
		ctx = new ClassPathXmlApplicationContext("milanbeans.xml");
		service = (CustomerService)ctx.getBean("customerService");
	}


	@Test
	public void testSaveCustomer() throws BeansException, ClassNotFoundException, SQLException 
	
	{
		givenACustomerWithAddressAndVisit();
		whenICallSaveCustomer();
		thenIWillExepectOneCustomerInDatabase();
		
	}
	



	@Test
	public void testLoadAllCustomer() 
	
	{
		fail("not implemenetd");
		
	}
	
	
	private void thenIWillExepectOneCustomerInDatabase() 
	{
		
		assertNotNull(robert);
		
		
		
		
	}


	private void whenICallSaveCustomer() throws MilanDataBaseException 
	{
		robert = service.saveCustomer(robert);
		
	}


	private void givenACustomerWithAddressAndVisit() 
	{
		robert = new Customer();
		robert.setFirstName("rober");
		robert.setLastName("Dow");
		robert.setIsAMember("Y");
		robert.setMemberType("GOLD");
		//
		Address robertAddress = new Address("32767 clairing", "culver city", "CA", "90034");
		robert.setAddress(robertAddress);

		Visit visit = new Visit(1l,1l,new Date(),120.22,233.22);
		visit.setDescription("tidats visit");
		
		List<Visit> visits = new ArrayList<Visit>();
		visits.add(visit);
		
		Visit visit1 = new Visit(1l,1l,new Date(),120.22,233.22);
		visit1.setDescription("yesterdays visit");
		
		visits.add(visit1);
		
		robert.setVisits(visits);
		
	}

}
