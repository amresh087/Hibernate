package com.sathya.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Passport_tab")

public class Passport {
	
	@Id
	private int passoprtId;
	@Temporal(TemporalType.DATE)
	
	private Date expDate;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="pid",nullable=false,unique=true)
	
	private Person persions;
	public int getPassoprtId() {
		return passoprtId;
	}
	public void setPassoprtId(int passoprtId) {
		this.passoprtId = passoprtId;
	}
	public Date getExpDate() {
		return expDate;
	}
	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}
	public Person getPersions() {
		return persions;
	}
	public void setPersions(Person persions) {
		this.persions = persions;
	}
	@Override
	public String toString() {
		return "Passport [passoprtId=" + passoprtId + ", expDate=" + expDate + ", persions=" + persions + "]";
	}
	 

}
