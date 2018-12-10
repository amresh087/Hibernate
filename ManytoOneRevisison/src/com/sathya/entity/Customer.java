package com.sathya.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cu_tab")

public class Customer {
	@Id
	private int custId;
    public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCuctomerName() {
		return cuctomerName;
	}
	public void setCuctomerName(String cuctomerName) {
		this.cuctomerName = cuctomerName;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", cuctomerName=" + cuctomerName + "]";
	}
	private String cuctomerName;
    
	

}
