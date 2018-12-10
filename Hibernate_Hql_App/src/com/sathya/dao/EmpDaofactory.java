package com.sathya.dao;

public class EmpDaofactory {
private static EmpDao dao;
public synchronized static EmpDao getinstance()
{
	if(dao==null)
	{
		dao=new EmpDaoImp();
		
	}
	return dao;
	
}

}
