package com.sathya.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.stat.Statistics;

import com.sathya.entity.Flight;

import co.sathya.util.HibernateUtil;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=HibernateUtil.getSessionfactory();
		Session session1=factory.openSession();
		Session session2=factory.openSession();
		Session session3=factory.openSession();
		Statistics states=factory.getStatistics();
		//Count the open session
		System.out.println("Open session="+states.getSessionOpenCount());
		
		Flight ff=new Flight();
		ff.setFlightno(909090907);
		ff.setSource("LKO");
		ff.setDestination("GOA");
		ff.setStatus("Delayed");
		Transaction tx=session1.beginTransaction();
		
		session1.save(ff);
		tx.commit();
		//count the gloabl entity
		System.out.println("GloabalEntity="+states.getEntityInsertCount());
		session1.close();
		//count the close connection
		System.out.println("close session="+states.getSessionCloseCount());
		Transaction tx1=session2.beginTransaction();
		
		tx1.rollback();
		//Count the Transaction
		System.out.println("Count transaction="+states.getTransactionCount());
		//Sucessfull transaction
		System.out.println("Sucessful transaction="+states.getSessionOpenCount());
		
		
		
		

	}

}
