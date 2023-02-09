package com.cg.OnlineTermInsurance.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Policy {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private int id;
    @Column(name="description")
    private String description;
    @Column(name="yearsOfPayments")
    private int yearsOfPayment;
    @Column(name="amount")
    private double amount;
    @Column(name="maturityPeriod")
    private int maturityPeriod;
    @Column(name="maturityAmount")
    private double maturityAmount;
    public Policy() {
        super();
        // TODO Auto-generated constructor stub
    }
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
	@Override
	public String toString() {
		return "Policy [id=" + id + ", description=" + description + ", yearsOfPayment=" + yearsOfPayment + ", amount="
				+ amount + ", maturityPeriod=" + maturityPeriod + ", maturityAmount=" + maturityAmount + "]";
	}
    
    
}
