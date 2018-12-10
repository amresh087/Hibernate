package com.sathya.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.sathya.entity.Item;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//step-1load confiuration file
		Configuration conf=new Configuration();
		conf.configure("com/sathya/config/hibernate.cfg.xml");
		//create service registery
		StandardServiceRegistryBuilder bulider=new StandardServiceRegistryBuilder();
		bulider.applySettings(conf.getProperties());
		ServiceRegistry registry=bulider.build();
		SessionFactory factory=conf.buildSessionFactory(registry);
		//open session factory
		Session session=factory.openSession();
		Item item=new Item(103,"LG",99090);
		Transaction tx=session.beginTransaction();
		session.save(item);
		tx.commit();
		//close session
		session.close();
		factory.close();
		
		
		
		
		
		
		
		

	}

}
