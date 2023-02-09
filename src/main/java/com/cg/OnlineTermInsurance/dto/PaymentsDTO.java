package com.cg.OnlineTermInsurance.dto;

import java.time.LocalDate;

public class PaymentsDTO {

	 

    private int paymentId;
    private String emailId;
    private int applicationId;
    private double PaymentAmount;
    private String paymentDescription;
    private LocalDate paymentDate;
    private String paymentStatus;

 

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
