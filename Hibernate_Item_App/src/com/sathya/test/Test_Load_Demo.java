package com.sathya.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.sathya.entity.Item;

public class Test_Load_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Configuration conf=new Configuration();
        conf.configure("com/sathya/config/hibernate.cfg.xml");
        StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder();
        builder.applySettings(conf.getProperties());
        ServiceRegistry registry=builder.build();
        SessionFactory factory=conf.buildSessionFactory(registry);
        Session session1=factory.openSession();
        Session session2=factory.openSession();
        
        //load the obects
        Object ob1=session1.get(Item.class,101);
        session1.clear();//demo for clear method
        Object ob2=session1.get(Item.class,102);
        Object ob3=session1.get(Item.class,101);
        Object ob4=session2.get(Item.class,101);
        session2.evict(ob4);//Demo for evict method
        Object ob5=session2.get(Item.class,101);
        Object ob6=session1.get(Item.class,109);
        Item i=(Item)ob6;
       // System.out.println(i.getItemName());
        //Load method demo
        Object ob7=session1.load(Item.class,1019);
        /*Item i=(Item)o;
        System.out.println(i.getItemName());
        
        System.out.println(i.getItemId());
        
        System.out.println(i.getPrice());*/
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
                   
        
        
        
        
        
        
        
        
        
	}

}
