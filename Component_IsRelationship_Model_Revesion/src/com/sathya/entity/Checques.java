package com.sathya.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="chq_tab")
@PrimaryKeyJoinColumn(name="tx_ID")

public class Checques extends Payments
{
	private int checkNo;
	@Column(length=8)
	String checkType;
	public Checques()
	{
		
	}
	public Checques(int txId,double amount,Date txDate,int checkNo,String checkType)
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
	


