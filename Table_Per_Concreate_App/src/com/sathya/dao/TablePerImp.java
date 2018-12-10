package com.sathya.dao;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sathya.entity.Card;
import com.sathya.entity.Checque;

import co.sathya.util.HibernateUtil;

public class TablePerImp implements TablePer {
	private	SessionFactory	factory;	

	public TablePerImp()
{
	factory=HibernateUtil.getSessionfactory();
	
}
	@Override
	public void savecard(Card card) {
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		
		session.save(card);
		tx.commit();
		
		

	}

	@Override
	public void saveChecque(Checque chq) {
		// TODO Auto-generated method stub
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		
		session.save(chq);
		tx.commit();
		
		

	}

}
