package com.classes;


	
	import java.io.Serializable;

		

		
		public class Emp implements Serializable {
		    
		   private static final long serialVersionUID = 1L ;
		    private String firstName;
		    private String lastName;
		    private String emailId;
		    private String city;
		    public String getFirstName() {
		        return firstName;
		    }
		    public void setFirstName(String firstName) {
		        this.firstName = firstName;
		    }
		    public String getLastName() {
		        return lastName;
		    }
		    public void setLastName(String lastName) {
		        this.lastName = lastName;
		    }
		    public String getemailId() {
		        return emailId;
		    }
		    public void setemailId(String emailId) {
		        this.emailId = emailId;
		    }
		    public String getcity() {
		        return city;
		    }
		    public void setcity(String city) {
		        this.city = city;
		    }
		}


