package com.info;


	//package net.javaguides.jsp.jdbc.database;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
//import java.sql.ResultSet;

import java.sql.SQLException;

	//import com.info.Employee;

	public class Useremp {
		
	    public int registerEmployee( Employee employee) throws ClassNotFoundException {
	        
	    	String INSERT_USERS_SQL = "Insert into User_info(ID,Name, Password,Email,city) values (?,?,?,?,?)";
	        int result = 0;
  
	        Class.forName("oracle.jdbc.driver.OracleDriver");
	        
	        try (Connection connection = DriverManager.
	        		getConnection("jdbc:oracle:thin:@localhost:1521:xe","ANIL", "shlok");

	            // Step 2:Create a statement using connection object
	            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
	        	preparedStatement.setInt(1, employee.getID());
	            preparedStatement.setString(2, employee.getFirstName());
	            preparedStatement.setString(3, employee.getLastName());
	            preparedStatement.setString(4, employee.getemailId());
	            preparedStatement.setString(5, employee.getcity());

	            System.out.println(preparedStatement);
	            // Step 3: Execute the query or update query
	            result = preparedStatement.executeUpdate();

	        } catch (SQLException e) {
	            // process sql exception
	            printSQLException(e);
	        }
	        return result;
	    	    
	    }
	        
	      
	
	   private static void printSQLException(SQLException ex) {
	        for (Throwable e: ex) {
	            if (e instanceof SQLException) {
	                e.printStackTrace(System.err);
	                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
	                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
	                System.err.println("Message: " + e.getMessage());
	                Throwable t = ex.getCause();
	                while (t != null) {
	                    System.out.println("Cause: " + t);
	                    t = t.getCause();
	                }
	            }
	        }
	   }
	}