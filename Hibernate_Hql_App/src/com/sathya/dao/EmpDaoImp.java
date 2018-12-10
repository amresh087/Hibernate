package com.sathya.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sathya.entity.Employee;

import co.sathya.util.HibernateUtil;

public class EmpDaoImp implements EmpDao {
	SessionFactory	factory;	

	public EmpDaoImp()
{
	factory=HibernateUtil.getSessionfactory();
	
}
	@Override
	public void dispEmployeeByDeptno(int depno) {
	Session session=factory.openSession();
		String hql="select e from Employee e where e.empDeptno=?";
	Query query=session.createQuery(hql);
     query.setParameter(0,depno);
      List list=query.list();
      
			Iterator il=list.iterator();
			while(il.hasNext())
			{
				Employee e=(Employee)il.next();
				System.out.println(e);
			}
			session.close();
			

	}
	public void disp()
	{
		
	
			Session session1=factory.openSession();
				String hql="select e from Employee e";
			Query query=session1.createQuery(hql);
		    
		      List list=query.list();
		      
					Iterator il=list.iterator();
					while(il.hasNext())
					{
						Employee e=(Employee)il.next();
						System.out.println(e);
					}
		
	}

	@Override
	public void updateEmployeeByDeptno(int sal, int deptno) {
		// TODO Auto-generated method stub
		Session session1=factory.openSession();
		String hql="update Employee  e set e.empSal=? where e.empDeptno=?";
		Query query=session1.createQuery(hql);
		query.setParameter(0,sal);
		query.setParameter(1,deptno);
		
		Transaction tx=session1.beginTransaction();
		
		int i=query.executeUpdate();
		System.out.println(i);
		tx.commit();
	
		

	}

}
