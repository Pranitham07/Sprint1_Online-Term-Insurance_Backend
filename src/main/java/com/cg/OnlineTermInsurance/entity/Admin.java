package com.cg.OnlineTermInsurance.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="admin")
public class Admin {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="adminId")
    private int adminId;
    @Column(name="firstName")
    private String firstName;
    @Column(name="middleName")
    private String middleName;
    @Column(name="lastName")
    private String lastName;
    @Column(name="password")
    private String password;
    @Column(name="emailId")
    private String emailId;
    @Column(name="contactNo")
    private long contactNo;
    
    
    public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
    
	public int getAdminId() {
        return adminId;
    }
    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    public long getContactNo() {
        return contactNo;
    }
    public void setContactNo(long contactNo) {
        this.contactNo = contactNo;
    }

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName="
				+ lastName + ", password=" + password + ", emailId=" + emailId + ", contactNo=" + contactNo + "]";
	}

 

    
}
