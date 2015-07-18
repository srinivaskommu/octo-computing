package com.milan.sym.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.milan.sym.domain.Customer;
import com.milan.sym.domain.CustomerDAO;
import com.milan.sym.domain.CustomerDaoJDBCImpl;
import com.milan.sym.util.MilanDataBaseException;

public class CustomerServiceImpl implements CustomerService 
{
//	@Autowired
	CustomerDAO customerDao;
	

	public CustomerServiceImpl() 
	{
		
		
	}

	public void saveCustomer(Customer customer) throws MilanDataBaseException 
	{
		customerDao.createCustomer(customer);

	}



}
