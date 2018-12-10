package com.sathya.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sathya.entity.Address;
import com.sathya.entity.Employee;
import com.sathya.util.HibernateUtil;

public class Test {
	public static void main(String[] args) {
		SessionFactory factory=HibernateUtil.getSessionfactory();
		Session session=factory.openSession();
		
		
		   Transaction tx=session.beginTransaction();
		   
		  Employee e=new Employee();
		Address ad=new Address();
		ad.setCity("faizabd");
		ad.setHno("ABC23");
		e.setAddress(ad);
		e.setEmpId(19809);
		e.setEmpName("Durgesh");
		   session.save(e);
		   tx.commit();
		   
		   
		     
	}

}
