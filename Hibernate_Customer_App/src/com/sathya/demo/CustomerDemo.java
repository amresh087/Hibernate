package com.sathya.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.satya.entity.Customer;

public class CustomerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration conf=new Configuration();
		conf.configure("com/sathya/config/customer.cfg.xml");
		StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder();
		builder.applySettings(conf.getProperties());
		ServiceRegistry registry=builder.build();
		SessionFactory factory=conf.buildSessionFactory(registry);
		Session session=factory.openSession();
		Customer co=new Customer();
		Transaction ts=session.beginTransaction();
		co.setCustomerName("king");
		co.setCity("hyd");
		session.save(co);
		ts.commit();
		
		

	}

}
