package com.sathya.loan;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.sathya.entity.LoanDemo;

public class LoanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration conf=new Configuration();
		conf.configure("com/sathya/config/hibernate.cfg.xml");
		StandardServiceRegistryBuilder bulider=new StandardServiceRegistryBuilder();
		bulider.applySettings(conf.getProperties());
		ServiceRegistry registry=bulider.build();
		SessionFactory factory=conf.buildSessionFactory(registry);
		Session session=factory.openSession();
		
		LoanDemo ob=new LoanDemo(101,"study",998900);
		
		
		System.out.println(ob.toString());
		Transaction tx=session.beginTransaction();
		session.save(ob);
		tx.commit();
		
		
		
		
		

	}

}
