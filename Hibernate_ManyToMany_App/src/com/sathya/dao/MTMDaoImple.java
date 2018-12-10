package com.sathya.dao;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sathya.entity.Student;
import com.sathya.entity.course;

import co.sathya.util.HibernateUtil;

public class MTMDaoImple {
	private SessionFactory factory;
	public MTMDaoImple()
	{
		factory=HibernateUtil.getSessionfactory();
	}
	public void saveStudentWithCourse()
	{
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		Student s1=new Student();
		s1.setId(101);s1.setName("Durgesh");
		Student s2=new Student();
		s2.setId(102);s2.setName("Manish");
		
		course c1=new course();
		c1.setId(901);c1.setName("Java");
		
		course c2=new course();
		c2.setId(902);c2.setName("Python");
		
		course c3=new course();
		c3.setId(903);c3.setName("oracle");
		
		
		Set<course> set1=new HashSet();
		
		set1.add(c1);
		set1.add(c2);
		set1.add(c3);
		s1.setCourses(set1);
		
Set<course> set2=new HashSet();
		
		set2.add(c1);
		set2.add(c2);
		
		s2.setCourses(set2);
		
		session.save(s1);
		session.save(s2);
		tx.commit();
		}
	
public 	void removecoursefromStudent(int cid,int sid)
	{
		Session session=factory.openSession();
		Student s1=(Student)session.get(Student.class,sid);
		Set<course> set1=s1.getCourses();
		//load the course which yu want to remove
		course c1=(course)session.get(course.class,cid);
		Transaction tx=session.beginTransaction();
		       set1.remove(c1);
		       tx.commit();
		       session.close();
		
	}
	
}
