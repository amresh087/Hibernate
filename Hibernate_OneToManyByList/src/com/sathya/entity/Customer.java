package com.sathya.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table(name="Customer_tab")

public class Customer {
	
	@Id
	private int custId;
	@Column(length=12)
	
	private String custName;
   @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
   @JoinColumn(name="custId_fk")
   @OrderColumn(name="loan_oredr")
   
   private List<Loan> loans;
   
public int getCustId() {
	return custId;
}
public void setCustId(int custId) {
	this.custId = custId;
}
public String getCustName() {
	return custName;
}
public void setCustName(String custName) {
	this.custName = custName;
}
public List<Loan> getLoans() {
	return loans;
}
public void setList(List<Loan> loans) {
	this.loans = loans;
}
   
   
   
   


}
