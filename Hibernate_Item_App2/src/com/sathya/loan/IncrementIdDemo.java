package com.sathya.loan;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.sathya.entity.LoanDemo;

public class IncrementIdDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Configuration conf=new Configuration();
         conf.configure("com/sathya/config/increment.cfg.xml");
         StandardServiceRegistryBuilder builder= new StandardServiceRegistryBuilder();
         builder.applySettings(conf.getProperties());
         ServiceRegistry registry=builder.build();
         SessionFactory factory=conf.buildSessionFactory(registry);
         Session session=factory.openSession();
         Transaction tx=session.beginTransaction();
         LoanDemo ob=new LoanDemo();
         ob.setLoanName("Home");
         ob.setAmount(989898);
         session.save(ob);
         tx.commit();
         
         
         
	}

}
