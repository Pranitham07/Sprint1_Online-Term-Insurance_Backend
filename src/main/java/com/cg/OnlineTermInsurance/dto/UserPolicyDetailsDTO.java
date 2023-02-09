package com.cg.OnlineTermInsurance.dto;
import java.util.Date;



public class UserPolicyDetailsDTO {
	private int policyId;
	private int userid;
	private int userpolicyid;
	private Date registeredDate;
	private double amount;
	private int totalTime;
	private double amountPaid;
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
}