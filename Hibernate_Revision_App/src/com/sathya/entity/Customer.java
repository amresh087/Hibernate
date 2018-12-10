package com.sathya.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity

@Table(name="Customer_Tab")
public class Customer {
	@Id
	
	private int customerId;
	@Column(length=25)
	
      private String customerName;
	@Column(length=20)
	private String productName;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Customer()
	{
		
	}
	public Customer(int customerId, String customerName, String productName) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.productName = productName;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", productName=" + productName
				+ ", getCustomerId()=" + getCustomerId() + ", getCustomerName()=" + getCustomerName()
				+ ", getProductName()=" + getProductName() + "]";
	}
	
	
	
	
	
}
