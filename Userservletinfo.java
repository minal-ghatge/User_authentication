package com.info;

import java.io.IOException;
import java.io.PrintWriter;
//import java.io.PrintWriter;
//import java.sql.SQLException;

import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Userservletinfo")
public class Userservletinfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
       
    

	
	//@SuppressWarnings("null")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		{
	        response.setContentType("text/html");  
	        PrintWriter out = response.getWriter();  
	              
	        String n=request.getParameter("emailId");  
	        String p=request.getParameter("password");  
	              
	        if(LoginDao.validate(n, p)){  
	            RequestDispatcher rd=request.getRequestDispatcher("Welcome");  
	            rd.forward(request,response);  
	        }  
	        else{  
	            out.print("Sorry username or password error");  
	            RequestDispatcher rd=request.getRequestDispatcher("Index.jsp");  
	            rd.include(request,response);  
	        }  
	              
	        out.close();  
	        }  
	    }  
    
      
    
	
    


	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		{
	        response.setContentType("text/html");  
	        PrintWriter out = response.getWriter();  
	              
	        String n=request.getParameter("emailId");  
	        String p=request.getParameter("password");  
	              
	        if(LoginDao.validate(n, p)){  
	            RequestDispatcher rd=request.getRequestDispatcher("Userdetails1.jsp");  
	            rd.forward(request,response);  
	        }  
	        else{  
	            out.print("'<a href='Login.jsp'>User not register Please register!!!!!</a>'"); 
	            
	            //RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");  
	          //  rd.include(request,response);  
	        }  
	              
	        out.close();  
	        }  
	    }  
}
      
    
	