package com.cg.OnlineTermInsurance.entity;


import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "payments")
public class Payments {
private static final String GenerationTpye = null;
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int paymentId;
private String emailId;
private int applicationId;
private double PaymentAmount;
 private String paymentDescription;
 private LocalDate paymentDate;
 //@OneToOne(mappedBy = "payments")
 private String paymentStatus;
 
 
 

public Payments() {
	super();
	// TODO Auto-generated constructor stub
}



public Payments(int paymentId, String emailId, int applicationId, double paymentAmount, String paymentDescription,
		LocalDate paymentDate, String paymentStatus) {
	super();
	this.paymentId = paymentId;
	this.emailId = emailId;
	this.applicationId = applicationId;
	PaymentAmount = paymentAmount;
	this.paymentDescription = paymentDescription;
	this.paymentDate = paymentDate;
	this.paymentStatus = paymentStatus;
}



public int getPaymentId() {
	return paymentId;
}



public void setPaymentId(int paymentId) {
	this.paymentId = paymentId;
}



public String getEmailId() {
	return emailId;
}



public void setEmailId(String emailId) {
	this.emailId = emailId;
}



public int getApplicationId() {
	return applicationId;
}



public void setApplicationId(int applicationId) {
	this.applicationId = applicationId;
}



public double getPaymentAmount() {
	return PaymentAmount;
}



public void setPaymentAmount(double paymentAmount) {
	PaymentAmount = paymentAmount;
}



public String getPaymentDescription() {
	return paymentDescription;
}



public void setPaymentDescription(String paymentDescription) {
	this.paymentDescription = paymentDescription;
}



public LocalDate getPaymentDate() {
	return paymentDate;
}



public void setPaymentDate(LocalDate paymentDate) {
	this.paymentDate = paymentDate;
}



public String getPaymentStatus() {
	return paymentStatus;
}



public void setPaymentStatus(String paymentStatus) {
	this.paymentStatus = paymentStatus;
}




}


