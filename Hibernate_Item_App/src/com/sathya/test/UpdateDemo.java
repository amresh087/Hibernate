package com.sathya.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.sathya.entity.Item;

public class UpdateDemo {

	
	public static void main(String s[])
	{
		
	
		Configuration conf= new Configuration();
		conf.configure("com/sathya/config/hibernate.cfg.xml");
		StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder();
		builder.applySettings(conf.getProperties());
		ServiceRegistry registry=builder.build();
		SessionFactory factory=conf.buildSessionFactory(registry);
		Session session=factory.openSession();
		Object o=session.load(Item.class,101);
		Item i=(Item)o;
		i.setPrice(980000);
		Transaction tx=session.beginTransaction();
		session.update(i);
		tx.commit();
		session.close();
		factory.close();
		
		
		
		
	}

}
