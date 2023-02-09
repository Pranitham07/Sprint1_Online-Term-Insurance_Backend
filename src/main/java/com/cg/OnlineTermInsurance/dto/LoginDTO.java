package com.cg.OnlineTermInsurance.dto;

public class LoginDTO {

	 private int id;
	    private String password;
	    
	    public LoginDTO(String password) {
	        super();
	        this.password = password;
	    }
	    public LoginDTO() {
	        // TODO Auto-generated constructor stub
	    }
	   
	    public String getPassword() {
	        return password;
	    }
	    public void setPassword(String password) {
	        this.password = password;
	    }
	    public int getId() {
	        return id;
	    }
	    public void setId(int id) {
	        this.id = id;
	    }



	 

	
	
}
