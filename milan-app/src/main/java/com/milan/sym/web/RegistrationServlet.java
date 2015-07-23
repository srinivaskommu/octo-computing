package com.milan.sym.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			  {
						    response.setContentType("text/html");  
						    PrintWriter out = response.getWriter();
						    
						    String firstname=request.getParameter("firstname");
						    String lastname=request.getParameter("lastname");
						   String Dob=request.getParameter("Dob");
							String Adress=request.getParameter("Adress"); 
							   String aptno=request.getParameter("aptno");
							   String Streetname=request.getParameter("Streetname");
							   String city=request.getParameter("city");
							   String State=request.getParameter("State");
							   String email=request.getParameter("email");
							   String username=request.getParameter("username");  
							    String password=request.getParameter("password"); 
							  out.print("<html>");  
							  out.print("<body>");  
				              out.print(firstname+"<br>");
							    out.print(lastname+"<br>");
							    out.print(Dob+"<br>");
							    out.print(Adress+"<br>");
							    out.print(aptno+"<br>");
							    out.print(Streetname+"<br>");
							    out.print(city+"<br>");
							    out.print(State+"<br>");
							    out.print(email+"<br>");
							    out.print(username+"<br>");
							    out.print("</body>");
							    out.print("</html>");
						// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	}

}
