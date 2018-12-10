package com.sathya.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sathya.entity.Address;
import com.sathya.entity.Employee;

import co.sathya.util.HibernateUtil;

public class TestDemo {

	public static void main(String[] args) {
		
       SessionFactory factory=HibernateUtil.getSessionfactory();
       Session session=factory.openSession();
       Transaction tx=session.beginTransaction();
       //create an object  of address class for passin adress object
       Address ad=new Address("8900h","ammerpet","hyd");
       Employee e=new Employee(101,"Durgesh",ad);
       session.save(e);
       tx.commit();
       session.close();
       
	}

}
