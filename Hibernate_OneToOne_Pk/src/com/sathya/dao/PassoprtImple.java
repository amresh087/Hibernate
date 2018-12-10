package com.sathya.dao;

import java.text.SimpleDateFormat;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sathya.entity.Passport;
import com.sathya.entity.Person;

import co.sathya.util.HibernateUtil;

public class PassoprtImple implements PassportDao {
  private SessionFactory factory;
  
	public  PassoprtImple()
   {
	factory=HibernateUtil.getSessionfactory();   
   }
	public void savePassportwithPerson() 
	{
	Session session=factory.openSession();
	Person p1=new Person();
	p1.setPid(102);p1.setPname("Durgesh");
	Passport ps=new Passport();
     ps.setPassid(902);
	try
	{
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		java.util.Date expdate=sdf.parse("31/05/2029");
		ps.setExpDate(expdate);
	}
	catch(Exception e)
	{
	}
	Transaction tx=session.beginTransaction();
	
	ps.setPerson(p1);
	
	session.save(ps);
	tx.commit();
	session.close();
	
	

}
}
	
