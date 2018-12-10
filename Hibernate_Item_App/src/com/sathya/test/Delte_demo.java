package com.sathya.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.sathya.entity.Item;

public class Delte_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Configuration conf=new Configuration();
        conf.configure("com/sathya/config/hibernate.cfg.xml");
        StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder();
        builder.applySettings(conf.getProperties());
        ServiceRegistry registery=builder.build();
        SessionFactory factory=conf.buildSessionFactory(registery);
        Session session=factory.openSession();
        //first method of delete
        Transaction tx=session.beginTransaction();
        
        /*Item i=new Item();
        i.setItemId(101);
        session.delete(i);
        tx.commit();*/
        //Second method of delete
        Item i=(Item)session.load(Item.class,101);
        session.delete(i);
        tx.commit();
        
        
        
        
	}

}
