package com.milan.sym.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import com.milan.sym.domain.Customer;
import com.milan.sym.service.CustomerService;
import com.milan.sym.util.MilanDataBaseException;

@WebServlet("/hello")
public class CustomerServlet extends HttpServlet 
{
	@Autowired
	CustomerService customerService;

	
	private static final long serialVersionUID = 1372264036569690170L;

	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException 
	{
		res.setContentType("text/html");// setting the content type
		PrintWriter pw = res.getWriter();// get the stream to write the data
		
		List<Customer> customers = customerService.loadAllCustomers();
		for(Customer customer : customers)
		{
			pw.println("<html><body>");
			pw.println("WCusotmer NAme"+customer.getName());
			pw.println("</body></html>");
			
		}
	

		// writing html in the stream


		pw.close();// closing the stream
	
	}
	
	
	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException
	{
		
		//String name =  req.getAttribute("name");
		Customer cust = new Customer();
		try {
			customerService.saveCustomer(cust);
		} catch (MilanDataBaseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}