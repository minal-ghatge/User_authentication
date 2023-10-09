package com.info;

//import com.info.Employee;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Userloginservlet")
public class Userloginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L ;
	private Useremp useremp;

	    public void init() {
	    	useremp = new Useremp();
	    }

	    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	    	String sid=request.getParameter("ID"); 
			int id=Integer.parseInt(sid);  
	        String firstName = request.getParameter("uname");
	        String lastName = request.getParameter("pass");
	        String mail_id = request.getParameter("mail");
	        String city = request.getParameter("city");
	        Employee employee = new Employee();
	        employee.setID(id);
	        employee.setFirstName(firstName);
	        employee.setLastName(lastName);
	        employee.setemailId(mail_id);
	        employee.setcity(city);

	        try {
	        	useremp.registerEmployee(employee);
	        } catch (Exception e) {
	            
	            e.printStackTrace();
	        }

	     response.sendRedirect("Userdetails.jsp");
	    }
	    
}