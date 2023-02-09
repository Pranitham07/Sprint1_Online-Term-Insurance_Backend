package com.cg.OnlineTermInsurance.dto;



public class PolicyDTO {

	private int id;
    private String description;
    private int yearsOfPayment;
    private double amount;
    private int maturityPeriod;
    private double maturityAmount;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getYearsOfPayment() {
		return yearsOfPayment;
	}
	public void setYearsOfPayment(int yearsOfPayment) {
		this.yearsOfPayment = yearsOfPayment;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getMaturityPeriod() {
		return maturityPeriod;
	}
	public void setMaturityPeriod(int maturityPeriod) {
		this.maturityPeriod = maturityPeriod;
	}
	public double getMaturityAmount() {
		return maturityAmount;
	}
	public void setMaturityAmount(double maturityAmount) {
		this.maturityAmount = maturityAmount;
	}
    
    
}
