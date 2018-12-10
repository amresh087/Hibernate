package com.sathya.entity;

public class LoanDemo {
	private int loanId;
	private String loanName;
	private double amount;
	public LoanDemo()
	{
		
	}
public LoanDemo(int loanId)
	{
		this.loanId=loanId;
		
	}
	public LoanDemo(int loanId,String loanName,double amount)
	{
		this.loanId=loanId;
		this.loanName=loanName;
		this.amount=amount;
		
	}
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public String getLoanName() {
		return loanName;
	}
	public void setLoanName(String loanName) {
		this.loanName = loanName;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String toString()
	{
		return "LoanDemo[laonId="+loanId+",loanName="+loanName+",amount="+amount+"]";
		
	}
	
	
	

}
