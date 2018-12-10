package com.sathya.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.sathya.entity.Employee;

import co.sathya.util.HibernateUtil;

public class EmpDaoImp implements EmpDao {
private	SessionFactory	factory;	

	public EmpDaoImp()
{
	factory=HibernateUtil.getSessionfactory();
	
}
	@Override
	public void dispEmployeeByDeptno(int depno) {
     Session session=factory.openSession();
     Criteria ctir=session.createCriteria(Employee.class);
     Criterion cl=Restrictions.eq("empDeptno", depno);
     
     
     ctir.add(cl);
     List list=ctir.list();
     System.out.println(list);
     session.close();
   // Method for Printing the data System.out.println(list.toString());
			

	}
	

	@Override
public void aggregate()
{
Session session=factory.openSession();
Criteria ctri=session.createCriteria(Employee.class);
Projection p1=Projections.rowCount();
Projection p2=Projections.sum("empSal");
Projection p3=Projections.avg("empSal");
Projection p4=Projections.max("empSal");
ProjectionList plist=Projections.projectionList();
plist.add(p1);
plist.add(p2);
plist.add(p3);
plist.add(p4);
ctri.setProjection(plist);
List list=ctri.list();
Object[] aggr=(Object[])list.get(0);
System.out.println("row count="+aggr[0]);
System.out.println("Sum sal="+aggr[1]);
System.out.println("Aveage="+aggr[2]);
System.out.println("maximm="+aggr[3]);



}
}
