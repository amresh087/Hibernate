package com.sathya.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sathya.entity.Customer;

import co.sathya.util.HibernateUtil;

public class SecondLevelCacheDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=HibernateUtil.getSessionfactory();
		  Session session1=factory.openSession();
		  Session session2=factory.openSession();
		  Session session3=factory.openSession();
            Customer c=(Customer)session1.get(Customer.class,"101");
            session1.close();
            try
            {
            	Thread.sleep(3000);
            	
            }
            catch(Exception e)
            {
            	
            }
            Customer c1=(Customer)session2.get(Customer.class,"101");
            session2.close();
            Customer c2=(Customer)session3.get(Customer.class,"101");
		            
                       		  

	}

}
