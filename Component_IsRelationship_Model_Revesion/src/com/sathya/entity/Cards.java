package com.sathya.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="Card_tab")
@PrimaryKeyJoinColumn(name="tx_Id")

public class Cards extends Payments
{
	private int cardNo;
	@Column(length=10)
	private String cardType;
	public Cards()
	{
		
	}
	public Cards(int txId,double amount,Date txDate,int cardNo,String CardType)
	{
		super(txId,amount,txDate);
		this.cardNo=cardNo;
		this.cardType=CardType;
	}
	public int getCardNo() {
		return cardNo;
	}
	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}


}
