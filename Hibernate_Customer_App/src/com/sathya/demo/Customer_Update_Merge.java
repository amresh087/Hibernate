package com.sathya.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.satya.entity.Customer;

public class Customer_Update_Merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
		Configuration conf=new Configuration();
		conf.configure("com/sathya/config/customer.cfg.xml");
		StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder();
		builder.applySettings(conf.getProperties());
		ServiceRegistry registry=builder.build();
		SessionFactory factory=conf.buildSessionFactory(registry);
		Session session1=factory.openSession();
		Customer customer=(Customer)session1.get(Customer.class,"co21");
		session1.close();
		customer.setCity("faizabd");
		Session session2=factory.openSession();
		Transaction tx=session2.beginTransaction();
		
		Customer c=(Customer)session2.get(Customer.class,"co21");
		//session2.update(customer);//Update Demo
		
		
		//Demo for merge method
		
		session2.merge(customer);
		
		tx.commit();
		session2.close();
		
		factory.close();

	
	
	}

}
