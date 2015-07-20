package com.milan.sym.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;

import com.milan.sym.domain.Customer;
import com.milan.sym.domain.CustomerDAO;
import com.milan.sym.domain.CustomerDaoJDBCImpl;
import com.milan.sym.util.MilanDataBaseException;

public class CustomerServiceImpl implements CustomerService 
{

	CustomerDAO customerDao;
	

	public CustomerServiceImpl(CustomerDAO customerDao) throws ClassNotFoundException, SQLException 
	{
		this.customerDao = customerDao;
	}

	public void saveCustomer(Customer customer) throws MilanDataBaseException 
	{
		customerDao.createCustomer(customer);

	}



}
