package com.sathya.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity 
@Table(name="checque")


public class Checque extends Payment {
	private int checkNo;
	@Column(length=8)
	String checkType;
	public Checque()
	{
		
	}
	public Checque(int txId,double amount,Date txDate,int checkNo,String checkType)
	{
		super(txId,amount,txDate);
		this.checkNo=checkNo;
		this.checkType=checkType;
		
	}
	public int getCheckNo() {
		return checkNo;
	}
	public void setCheckNo(int checkNo) {
		this.checkNo = checkNo;
	}
	public String getCheckType() {
		return checkType;
	}
	public void setCheckType(String checkType) {
		this.checkType = checkType;
	}
	
	
	

}
