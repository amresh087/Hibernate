package com.sathya.dao;

public class DaoFactory {
	private static CustomerDao dao;
	public synchronized static CustomerDao getInstance()
	{
		if(dao==null)
		{
			dao=new CustomerImple();
		}
		return dao;
		
	}
	

}
