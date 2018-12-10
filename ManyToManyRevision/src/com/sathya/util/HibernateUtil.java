package com.sathya.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil 
{
	
	public static SessionFactory factory;
	public static  SessionFactory getSessionFactory()
	{
		if(factory==null)
		{
			Configuration cong=new Configuration();
			cong.configure("com/sathya/config/hibernate.cfg.xml");
          	StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder();
			builder.applySettings(cong.getProperties());
			ServiceRegistry registry=builder.build();
			factory=cong.buildSessionFactory(registry);
			
		}
		return factory;
		
	}

}
