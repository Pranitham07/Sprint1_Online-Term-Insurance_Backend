package com.cg.OnlineTermInsurance.entity;
import java.util.Date;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USERPOLICY_DETAILS")
public class UserPolicyDetails {

 

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int policyId;
    private int userid;
    private int userpolicyid;
    private Date registeredDate;
    private double amount;
    private int totalTime;
    private double amountPaid;
    public UserPolicyDetails() {
        super();
        // TODO Auto-generated constructor stub
    }
    public int getPolicyId() {
        return policyId;
    }
    public void setPolicyId(int policyId) {
        this.policyId = policyId;
    }
    public int getUserid() {
        return userid;
    }
    public void setUserid(int userid) {
        this.userid = userid;
    }
    public int getUserpolicyid() {
        return userpolicyid;
    }
    public void setUserpolicyid(int userpolicyid) {
        this.userpolicyid = userpolicyid;
    }
    public Date getRegisteredDate() {
        return registeredDate;
    }
    public void setRegisteredDate(Date registeredDate) {
        this.registeredDate = registeredDate;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public int getTotalTime() {
        return totalTime;
    }
    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }
    public double getAmountPaid() {
        return amountPaid;
    }
    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }
    @Override
    public String toString() {
        return "UserPolicyDetails [policyId=" + policyId + ", userid=" + userid + ", userpolicyid=" + userpolicyid
                + ", registeredDate=" + registeredDate + ", amount=" + amount + ", totalTime=" + totalTime
                + ", amountPaid=" + amountPaid + "]";
    }


}