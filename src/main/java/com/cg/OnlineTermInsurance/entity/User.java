	package com.cg.OnlineTermInsurance.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "users")
public class User implements Serializable {


    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int userId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String email;
    private long mobileNumber;
    private long aadharCardNo;
    private String password;
    private String policy;

    public User() {
        super();
        // TODO Auto-generated constructor stub
    }

    public User(int userId, String firstName, String middleName, String lastName, String email, long mobileNumber,
            long aadharCardNo, String password, String policy) {
        super();
        this.userId = userId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.aadharCardNo = aadharCardNo;
        this.password = password;
        this.policy = policy;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public long getAadharCardNo() {
        return aadharCardNo;
    }

    public void setAadharCardNo(long aadharCardNo) {
        this.aadharCardNo = aadharCardNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    @Override
    public String toString() {
        return "User [userId=" + userId + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName="
                + lastName + ", email=" + email + ", mobileNumber=" + mobileNumber + ", aadharCardNo=" + aadharCardNo
                + ", password=" + password + ", policy=" + policy + "]";
    }
}
