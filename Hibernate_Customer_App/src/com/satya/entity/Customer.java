package com.satya.entity;

public class Customer {
private String customerId;
private String customerName;
private String city;
public Customer()
{
	
}
public Customer(String customerId)
{
	this.customerId=customerId;
}
public Customer(String customerId,String customerName,String city)
{
	this.customerId=customerId;
	this.customerName=customerName;
	this.city=city;
}
public String getCustomerId() {
	return customerId;
}
public void setCustomerId(String customerId) {
	this.customerId = customerId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}

public String toString()
{
return "Customer[customerId="+customerId+",customerName="+customerName+",city="+city+"]";	
}
}
