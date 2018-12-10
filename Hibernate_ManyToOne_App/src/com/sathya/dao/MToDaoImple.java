package com.sathya.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sathya.entity.Customer;
import com.sathya.entity.Loan;

import co.sathya.util.HibernateUtil;

public class MToDaoImple implements MToDao {


	private SessionFactory factory;
	public MToDaoImple()
	{
		factory=HibernateUtil.getSessionfactory();
		
	}
	
	@Override
	public void saveloanByCustomer() 
	{
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		Customer c=new Customer();
		c.setCustId(102);
		c.setCustName("Durgesh");
		Loan l1=new Loan();
		l1.setLoanId("k013");
		l1.setCustomer(c);
		l1.setLoanAmount(9090);
		Loan l2=new Loan();
		l2.setLoanId("k014");
		l2.setLoanAmount(9094);
		l2.setCustomer(c);
        session.save(l1);
        session.save(l2);
        tx.commit();
 	}

	@Override
	public void deleteloanDataById(String loanId) 
	{
		
		Session session=factory.openSession();
		Loan loan=(Loan)session.get(Loan.class,loanId);
		Transaction tx=session.beginTransaction();
		
		session.delete(loan);
		tx.commit();
		
				
				
				

	}
	public void joinDemo()
	{
		Session session=factory.openSession();
		String hql="select c.custName,l.loanId,l.loanAmount from Loan l join l.customer c";
		Query query=session.createQuery(hql);
		List list=query.list();
		Iterator itr=list.iterator();
		
		while(itr.hasNext())
		{
			Object[] obj=(Object[])itr.next();
			System.out.println(obj[0]+"\t"+obj[1]+"\t"+obj[2]);
		}
		session.close();
	}

}
