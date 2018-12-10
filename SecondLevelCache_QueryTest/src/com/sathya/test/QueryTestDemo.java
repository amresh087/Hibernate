package com.sathya.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.sathya.util.HibernateUtil;

public class QueryTestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=HibernateUtil.getSessionfactory();
		Session session=factory.openSession();
		 Session session1=factory.openSession();
		
		String hql="from Customer c where customerId=?";
		Query query=session.createQuery(hql);
		query.setParameter(0,"101");
		query.setCacheable(true);
	     List list=query.list();
	     
	     //second time
	    
	     String hql1="from Customer c where customerId=?";
			Query query1=session1.createQuery(hql1);
			query1.setParameter(0,"101");
			query1.setCacheable(true);
		     List list1=query1.list();
	     
	     
	     
	     
	     session.close();
		session1.close();

	}

}
