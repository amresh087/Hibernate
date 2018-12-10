package com.sathya.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="loan1")

public class Loan 
{
	@Id
	
 private int loanId;
 private int amount;
 @ManyToOne(cascade=CascadeType.ALL)
 
 @JoinColumn(name="custId_fk")
 
 private Customer customer;
@Override
public String toString() {
	return "Loan [loanId=" + loanId + ", amount=" + amount + ", customer=" + customer + "]";
}
public int getLoanId() {
	return loanId;
}
public void setLoanId(int loanId) {
	this.loanId = loanId;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
 
 
 
 
 
}
