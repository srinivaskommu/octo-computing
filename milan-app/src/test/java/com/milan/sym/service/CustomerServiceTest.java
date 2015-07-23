package com.milan.sym.service;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.milan.sym.domain.Customer;
import com.milan.sym.domain.CustomerDAO;
import com.milan.sym.domain.CustomerDaoJDBCImpl;
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
	}


	@Test
	public void testSaveCustomer() throws BeansException, ClassNotFoundException, SQLException 
	
	{
//		CustomerDAO customerDAO= (CustomerDAO)ctx.getBean("customerDao");
		robert =(Customer) ctx.getBean("robert");
		service = (CustomerService)ctx.getBean("customerService");
		service.saveCustomer(robert);
		
	}

}