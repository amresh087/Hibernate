package com.sathya.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtill {
	public static SessionFactory factory;
	public static SessionFactory getSessionaFactory()
	{
	if(factory==null)
	{
		Configuration conf=new Configuration();
		conf.configure("com/sathya/config/hibernate.cfg.xml");
		StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder();
		builder.applySettings(conf.getProperties());
		ServiceRegistry registry=builder.build();
		factory=conf.buildSessionFactory(registry);
	}
	return factory;
	
	}
}
