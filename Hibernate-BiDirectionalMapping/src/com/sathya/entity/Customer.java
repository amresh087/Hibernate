package com.sathya.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="customers1")

public class Customer {
	@Id
	private int custId;
	private String customerName;
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER,mappedBy="customer")
	private Set<Loan> loan;
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", customerName=" + customerName + "]";
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Set<Loan> getLoan() {
		return loan;
	}
	public void setLoan(Set<Loan> loan) {
		this.loan = loan;
	}
	

}
