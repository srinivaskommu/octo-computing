package com.milan.sym.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.milan.sym.domain.Customer;
import com.milan.sym.service.CustomerService;
import com.milan.sym.util.MilanDataBaseException;

public class CustomerServlet extends HttpServlet 
{
	@Autowired
	CustomerService customerService;

	private static final long serialVersionUID = 1372264036569690170L;
	
	
	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException 
	{
		Customer customer = new Customer();
		customer.setFirstName(req.getParameter("firstname"));
		customer.setLastName(req.getParameter("lastName"));
		customer.setIsAMember(req.getParameter("isMember"));
		customer.setIsAMember(req.getParameter("memberType"));
		
		
		///address
		
		
		
		///
		
		
		try {
			
			customerService.saveCustomer(customer);
			
			
			
		} catch (MilanDataBaseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		Customer cust = new Customer();
		try {
			customerService.saveCustomer(cust);
		} catch (MilanDataBaseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}
	
	

	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException 
	{
		
		
	
		
		

		
		
		
		
		res.setContentType("text/html");// setting the content type
		PrintWriter pw = res.getWriter();// get the stream to write the data


		
		pw.println("<html><body>");
		pw.println("WCusotmer NAme" + req.getParameter("firstname"));
		pw.println("</body></html>");

		// writing html in the stream

		pw.close();// closing the stream

	}

	

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this,
				config.getServletContext());
	}

}
