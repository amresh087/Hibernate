package com.sathya.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sathya.entity.Customer;
import com.sathya.entity.Loan;
import com.sathya.util.HibarnateUtil;

public class Test {
	public static void main(String[] args) {
		SessionFactory factory=HibarnateUtil.getSessionFactory();
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Customer c=new Customer();
		c.setCustId(189);
		c.setCuctomerName("Mahesh");
		session.save(c);
		Loan l=new Loan();
		l.setLoanAmount(15000);
		l.setLoanId(102);
		l.setCustomer(c);
		session.save(l);
		
		Loan loan=new Loan();
		 session.delete(l);
		 tx.commit();
		
		
	}

}
