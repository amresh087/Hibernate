package com.sathya.dao;

public class Daofactory {
	private static TablePer dao;
	public synchronized static TablePer getinstance()
	{
		if(dao==null)
		{
			dao=new TablePerImp();
			
		}
		return dao;
		
	}
	
	

}
