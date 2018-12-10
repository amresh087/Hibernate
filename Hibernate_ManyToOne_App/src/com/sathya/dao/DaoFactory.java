package com.sathya.dao;

public class DaoFactory {
	private static MToDao dao;
	public synchronized static MToDao getInstance()
	{
		if(dao==null)
		{
			dao=new MToDaoImple();
		}
		return dao;
		
	}
	

}
