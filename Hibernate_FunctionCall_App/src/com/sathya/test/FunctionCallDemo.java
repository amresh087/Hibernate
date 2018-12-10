package com.sathya.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.jdbc.Work;

import co.sathya.util.HibernateUtil;

public class FunctionCallDemo {

	public static void main(String[] args)  {
		
		SessionFactory factory=HibernateUtil.getSessionfactory();
		Session session=factory.openSession();
		session.doWork(new JdbcWork());
		
		
		
	}
}
