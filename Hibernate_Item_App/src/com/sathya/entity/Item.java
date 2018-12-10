package com.sathya.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Table;

@Entity
@Table(appliesTo="Item")





public class Item {
	
	
	@Id
	@Column(name="itemId")
	private int itemId;
	@Column(name="itemname")
	
	private String itemName;
	@Column(name="price")
	
	private double price;
	
	//default constructor
public Item()
{
}
public Item(int itemId)
{
	this.itemId=itemId;
}
public Item(int itemId,String itemName,double price)
{
	this.itemId=itemId;
	this.itemName=itemName;
	this.price=price;
	
}
//gentreats setter and getters method
public int getItemId() {
	return itemId;
}
public void setItemId(int itemId) {
	this.itemId = itemId;
}
public String getItemName() {
	return itemName;
}
public void setItemName(String itemName) {
	this.itemName = itemName;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String toString()
{
	return "Item[itemId="+itemId+",itemName="+itemName+",price="+price+"]";
	
}



}
