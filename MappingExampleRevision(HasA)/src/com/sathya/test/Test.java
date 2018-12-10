package com.sathya.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sathya.entity.Customer;
import com.sathya.entity.Loan;
import com.sathya.util.HibernateUtil;

public class Test {
	
	public static void main(String[] args) {
		SessionFactory factory=HibernateUtil.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		Loan loan1=new Loan();
		loan1.setLoanId(193);
		loan1.setAmount(8989);
		
		Loan loan2=new Loan();
		loan2.setLoanId(194);
		loan2.setAmount(89890);
		Set ss=new HashSet();
		
		ss.add(loan1);
		ss.add(loan2);
		Customer cust=new Customer();
		 cust.setCustId(10103);
		 cust.setCustName("Manish");
		 cust.setLoans(ss);
		 session.save(cust);
		 tx.commit();
		
		
		//Customer c=(Customer)session.get(Customer.class,190);
		//Loan l=(Loan)session.get(Loan.class,190);
		Customer c=(Customer)session.get(Customer.class,10101);
		//Set<Loan> s=c.getLoans();
		//s.remove(l);
		//tx.commit();
		
		//session.delete(l);
		
		
		
	}

}
