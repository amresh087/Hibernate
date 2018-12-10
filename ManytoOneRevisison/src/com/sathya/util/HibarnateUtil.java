package com.sathya.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibarnateUtil {
public  static SessionFactory factory;
public static SessionFactory getSessionFactory()
{
	if(factory==null)
	{
		Configuration conf=new Configuration();
		conf.configure("com/sathya/config/hibernate.cfg.xml");
		StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder();
				builder.applySettings(conf.getProperties());
		ServiceRegistry regitry=builder.build();
		factory=conf.buildSessionFactory(regitry);
	}
	return factory;
}
}
