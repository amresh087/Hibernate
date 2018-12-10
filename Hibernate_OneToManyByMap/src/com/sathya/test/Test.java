package com.sathya.test;

import com.sathya.dao.CustomerDao;
import com.sathya.dao.CustomerImple;
import com.sathya.dao.DaoFactory;

public class Test {

	public static void main(String[] args) 
	{
		CustomerDao d=DaoFactory.getInstance();
		d.saveCustomerWithLoans();
		//d.removeloanAttribute();
       // d.selectCustomerById(102);		
		

	}

}
