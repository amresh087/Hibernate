package com.sathya.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sathya.entity.Flight;

import co.sathya.util.HibernateUtil;

public class TestDemo {
	private static SessionFactory factory;
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SessionFactory factory=metdata.getSessionFactoryBuilder().applyInterceptor(new MyInterCepter()).build();
		
		Flight ff=new Flight();
	     ff.setFlightno(1898989);
	     ff.setDestination("Mubai");
	     ff.setStatus("Ready");
	     ff.setSource("LKO");
	    Session session1=HibernateUtil.getSessionfactory().withOptions().interceptor(new MyInterCepter()).openSession();
	     
	     Transaction tx=session1.beginTransaction();
	     
	     session1.save(ff);
	     tx.commit();
	     Session session2=HibernateUtil.getSessionfactory().withOptions().interceptor(new MyInterCepter()).openSession();
	      Flight fo=(Flight)session2.get(Flight.class,189898);
	      Session session3=HibernateUtil.getSessionfactory().withOptions().interceptor(new MyInterCepter()).openSession();
	      Flight fo1=(Flight)session3.get(Flight.class,189898);
	      Transaction tx1=session3.beginTransaction();

	session3.delete(fo1);
	tx1.commit();
	
	}
	
	

}
