package com.sathya.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sathya.entity.Passport;
import com.sathya.entity.Person;
import com.sathya.util.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		SessionFactory factory=HibernateUtil.getSessionFactory();
		Session session=factory.openSession();
		Person p=new Person();
		p.setPid(1888);
		p.setPname("durgesh");
	   Passport ps=new Passport();
	   ps.setPassoprtId(8878976);
	   ps.setExpDate(new java.util.Date());
	   ps.setPersions(p);
	   Transaction tx=session.beginTransaction();
	   session.save(p);
	   session.save(ps);
	   tx.commit();
	   
	}
}
