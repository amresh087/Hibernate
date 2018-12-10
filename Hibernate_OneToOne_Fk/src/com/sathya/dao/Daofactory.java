package com.sathya.dao;

public class Daofactory {
private  static PassportDao dao;
public synchronized  static PassportDao getInstance()

{
if(dao==null)
{
	dao=new PassoprtImple();
	
}
return dao;
}
}
